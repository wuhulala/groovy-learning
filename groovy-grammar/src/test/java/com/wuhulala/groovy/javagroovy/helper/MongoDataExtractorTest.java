package com.wuhulala.groovy.javagroovy.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/10/29<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class MongoDataExtractorTest {

//    @Resource(name = "mongoDataExtractor")
//    private DataExtractor mongoDataExtractor;

//    @Test
//    public void doExtract() throws Exception {
//        String script = "{'find':'user'}";
//        Object result = mongoDataExtractor.extract(script);
//        System.out.println(result);
//    }


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test(){
        Object value = jdbcTemplate.queryForList("select * from user");
        System.out.println(value);
    }
}