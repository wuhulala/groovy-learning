package com.wuhulala.groovy.javagroovy;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 预警指标
 *
 * @author wuhulala<br>
 * @date 2018/10/29<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
@Data
public class WarningIndexCalculator {

    private List<String> dataProviders;

    private RuleExecutor ruleExecutor;

    private Map<String, Object> translator;

    public IndexResult doCalc(){

        Object[] params = getData(this.dataProviders);

        Object originValue = ruleExecutor.execute(params);

        return doTranslate(translator, originValue);
    }

    private IndexResult doTranslate(Map<String, Object> translator, Object originValue) {
        return null;
    }


    private Object[] getData(List<String> dataProviders) {

        return null;
    }

}
