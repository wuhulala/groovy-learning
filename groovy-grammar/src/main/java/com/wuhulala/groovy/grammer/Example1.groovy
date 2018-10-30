package com.wuhulala.groovy.grammer

/**
 * 0_0 o^o
 *
 * @since v1.0 < br >
 * @date 2018/10/27<br>
 * @author wuhulala < br >
 * @description o_o < br >
 */
class Example1 {
    static void main(String[] args) {
        def str1 = "Hello";
        def clos = {param -> println "${str1} ${param}"}
        clos.call("World");

        // We are now changing the value of the String str1 which is referenced in the closure
        str1 = "Welcome";
        clos.call("World");
    }
}
