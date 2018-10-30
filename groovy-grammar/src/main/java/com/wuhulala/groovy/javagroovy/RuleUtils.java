package com.wuhulala.groovy.javagroovy;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import groovy.lang.GroovyShell;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.IOException;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/10/28<br>
 * @description o_o<br>
 * @link https://blog.csdn.net/eric_sunah/article/details/11541307
 * @since v1.0<br>
 */
public class RuleUtils {

    public static Object executeInterface(String rulePath, Object... params) throws IOException, IllegalAccessException, InstantiationException {

        GroovyClassLoader loader = new GroovyClassLoader();

        Class groovyClass = loader.parseClass(new File(rulePath));

        RuleExecutor object = (RuleExecutor) groovyClass.newInstance();

        return object.execute(params);
    }


    public static Object executeGroovyFile(String rulePath, String methodName, Object... params) {
        try {

            GroovyClassLoader loader = new GroovyClassLoader();

            Class groovyClass = loader.parseClass(new File(rulePath));

            GroovyObject object = (GroovyObject) groovyClass.newInstance();

            return object.invokeMethod(methodName, params);

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }

    }

    public static Object executeShell(String runShell, Binding binding) {
        GroovyShell shell = new GroovyShell(binding);
        return shell.evaluate(runShell);
    }


    public static Object executeRule(String ruleScript, String methodName, Object... args) throws ScriptException, NoSuchMethodException {
        ScriptEngineManager factory = new ScriptEngineManager();

        ScriptEngine engine = factory.getEngineByName("groovy");

        engine.eval(ruleScript);

        Invocable inv = (Invocable) engine;

        return inv.invokeFunction(methodName, args);
    }

}
