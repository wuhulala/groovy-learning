package com.wuhulala.groovy.warn;

import com.wuhulala.groovy.javagroovy.RuleUtils;
import com.wuhulala.util.FileUtils;
import com.wuhulala.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;

import javax.script.ScriptException;
import java.util.HashMap;
import java.util.Map;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/11/6<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
@Slf4j
public class WarnLogic {

    /**
     * 执行预警脚本
     * <p>
     * <pre>
     *        {
     *            "code" : "W130101",
     *            "data" : {},
     *            "wave" : ""
     *        }
     *    </pre>
     *
     * @param req
     */
    public void execWarnIndex(WarnReq req) {

        // 1. 预置数据
        String indexCode = req.getCode();
        String data = req.getData();
        WarnIndex curIndex = getIndexByCode(indexCode);
        String script = curIndex.getScript();
        String config = curIndex.getIndexConfig();
        Map<String, Object> params = mergeDataAndConfig(curIndex, data);

        // 2. 执行引擎
        Object value = null;
        try {
            value = RuleUtils.executeRuleByDefault(script, params);
        } catch (ScriptException | NoSuchMethodException e) {
            log.error("预警指标[{}]的动态脚本执行异常",indexCode , e);
        }

        System.out.println(value);
        // 3. 发送预警


        // 4.


    }

    private Map<String, Object> mergeDataAndConfig(WarnIndex config, String data) {
        String thresholds = config.getThresholds();
        Map<String, Object> params = JsonUtils.parseJson(thresholds, Map.class);
        params.put("data", JsonUtils.parseJson(data, Map.class));
        return params;
    }

    private WarnIndex getIndexByCode(String indexCode) {
        WarnIndex warnIndex = new WarnIndex();
        warnIndex.setCode(indexCode);
        warnIndex.setScript(FileUtils.getFileContent("D:\\study\\groovy-demo\\groovy-grammar\\src\\main\\groovy\\warn_index_00001.groovy"));
        Map<String, Object> thresholds = new HashMap<>();
        thresholds.put("min", 10);
        thresholds.put("middle", 20);
        thresholds.put("max", 100);
        warnIndex.setThresholds(JsonUtils.toJson(thresholds));
        return warnIndex;
    }

    public static void main(String[] args) {
        WarnLogic warnLogic = new WarnLogic();
        WarnReq req = new WarnReq();
        req.setData("{\"x\": 40}");
        warnLogic.execWarnIndex(req);
    }

}
