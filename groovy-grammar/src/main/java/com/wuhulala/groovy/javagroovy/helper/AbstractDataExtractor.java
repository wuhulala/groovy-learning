package com.wuhulala.groovy.javagroovy.helper;

import java.util.Map;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/11/6<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
public abstract class AbstractDataExtractor implements DataExtractor {

    private Map<String, Object> params;

    @Override
    public Object extract(String script) {
        String realScript = doParse(script, params);
        return doExtract(realScript);
    }

    /**
     * 执行逻辑
     *
     * @param script
     * @return
     */
    public abstract Object doExtract(String script);

    private String doParse(String script, Map<String, Object> params) {
        // 替换script变量
        // params = {user_id=1}
        // select * from user where user_id = ?;
        // ====>
        // select * from user where user_id = 1;
        return script;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
