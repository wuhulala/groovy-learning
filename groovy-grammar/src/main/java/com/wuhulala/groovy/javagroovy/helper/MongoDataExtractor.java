package com.wuhulala.groovy.javagroovy.helper;

import lombok.Data;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/10/29<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
@Data
public class MongoDataExtractor implements DataExtractor {

    private MongoTemplate mongoTemplate;

    @Override
    public Object extract(String script) {
        return mongoTemplate.executeCommand(script);
    }
}
