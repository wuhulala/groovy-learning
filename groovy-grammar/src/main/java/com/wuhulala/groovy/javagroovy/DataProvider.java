package com.wuhulala.groovy.javagroovy;

import lombok.Data;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/10/29<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
@Data
public class DataProvider {


    private String id;

    /**
     * 数据源类型
     *
     * mongo/oracle/mysql/excel/
     */
    private String type;

    private String script;

    // 添加一步后置处理




}
