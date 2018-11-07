package com.wuhulala.groovy.javagroovy.helper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;

import java.util.Map;

/**
 * 关系型数据抽取器
 *
 * @author wuhulala<br>
 * @date 2018/11/7<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
public class SqlDataExtractor extends AbstractDataExtractor {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Object doExtract(String script, Class clazz) {
        return jdbcTemplate.query(script, SingleColumnRowMapper.newInstance(clazz));
    }

    @Override
    public String doParse(String script, Map<String, Object> params) {

        return super.doParse(script, params);
    }

}
