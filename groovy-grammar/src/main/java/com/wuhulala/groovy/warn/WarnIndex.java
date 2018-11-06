package com.wuhulala.groovy.warn;

import lombok.Data;

/**
 * 预警指标
 *
 * @author wuhulala<br>
 * @date 2018/11/6<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
@Data
public class WarnIndex {

    private String code;

    private String script;

    /**
     * 指标配置*
     * <p>
     * <pre>
     *    <s>企业编号</s>
     *    <s>行业编号</s>
     *    <s>区域编号</s>
     *    是否定时
     *    data_providers:[
     *        {
     *            "type" : "mongo",
     *            "script" : "https://docs.mongodb.com/manual/reference/command/"
     *        },
     *        {
     *            "type" : "sql",
     *            "script" : "select name,age from user_info where user_id = 1"
     *        }
     *
     *    ]
     *
     * </pre>
     */
    private String indexConfig;

    /**
     * 阈值
     * <p>
     * <pre>
     *     {
     *         // 默认配置
     *         "default" : {
     *
     *         },
     *         // 区域配置
     *         "area_440101":{
     *
     *         },
     *         // 行业配置
     *         "industry_01":{
     *
     *         },
     *         // 企业配置
     *         "inst_I00000001":{
     *
     *         }
     *     }
     * </pre>
     */
    private String thresholds;


}
