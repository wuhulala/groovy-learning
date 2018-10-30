package com.wuhulala.groovy.javagroovy;

import lombok.Data;

/**
 * 指标结果
 *
 * @author wuhulala<br>
 * @date 2018/10/29<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
@Data
public class IndexResult {

    /**指标编码*/
    private String code;

    /**指标名称*/
    private String name;

    /**原始值*/
    private Object originValue;

    /**结果值*/
    private Object resultValue;

    /**原因*/
    private String reason;

}
