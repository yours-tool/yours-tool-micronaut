package yours.tool.micronaut;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.runtime.Micronaut;


//@Introspected(packages={"yours.tool.micronaut.pojo.entity"})
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}