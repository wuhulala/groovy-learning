package com.wuhulala.groovy.javagroovy;

import groovy.lang.Binding;
import org.junit.Test;

import java.util.Objects;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/10/28<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
public class RuleUtilsTest {
    @Test
    public void testExecuteInterface() throws Exception {
        String path = "D:\\study\\groovy-demo\\groovy-grammar\\src\\main\\groovy\\index1.groovy";
        String methodName = "square";
        RuleUtils.executeInterface(path, methodName);
    }

    @Test
    public void testExecuteGroovyFile() throws Exception {
        String path = "D:\\study\\groovy-demo\\groovy-grammar\\src\\main\\groovy\\Demo.groovy";
        String methodName = "square";
        Integer x = 10;
        assert Objects.equals(RuleUtils.executeGroovyFile(path, methodName, x), 100);
    }

    @Test
    public void testExecuteShell() throws Exception {
        Binding binding = new Binding();
        binding.setVariable("x", 10);
        binding.setVariable("language", "Groovy");
        String runShell = "println\"Welcome to $language\"; y = x * 2; z = x * 3; return x ";

        Object value = RuleUtils.executeShell(runShell, binding);
        assert value.equals(10);

        assert binding.getVariable("y").equals(20);

        assert binding.getVariable("z").equals(30);
    }

    @Test
    public void testExecuteRule() throws Exception {
        Object[] params = {"Groovy"};

        String script = "def x = 10\n" +
                "def execute(Object... params) {\n" +
                "    String id = params[0]\n" +
                "    println(id + ':' + 10)\n" +
                "}";

       // String demoScript = "def hello(language) {return \"Hello $language\"}";
        Object v = RuleUtils.executeRule("name", script, params);

        System.out.println(v);
    }



}