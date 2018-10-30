import com.wuhulala.groovy.javagroovy.RuleExecutor

class index1 implements RuleExecutor {

    @Override
    Object execute(Object... params) {
        String id = params[0]
        println(id)
    }
}