package com.wuhulala.groovy.javagroovy.helper;

import lombok.Data;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Map;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/10/29<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
@Data
public class MongoDataExtractor extends AbstractDataExtractor {

    private MongoTemplate mongoTemplate;


    @Override
    public String doParse(String script, Map<String, Object> params) {
        return super.doParse(script, params);
    }

    @Override
    public Object doExtract(String script, Class clazz) {
        return mongoTemplate.executeCommand(script);
    }
}
