package com.wuhulala.groovy.javagroovy.helper;

/**
 * 数据抽取器
 *
 * @author wuhulala<br>
 * @date 2018/10/29<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
public interface DataExtractor {

    /**
     * 抽取
     *
     * @param script 动态查询脚本
     * @return 返回数据集
     */
    Object extract(String script, Class clazz);
}
