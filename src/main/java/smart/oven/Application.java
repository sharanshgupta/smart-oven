package smart.oven;

import io.micronaut.context.BeanContext;
import io.micronaut.runtime.Micronaut;
import smart.oven.helper.Oven;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
        BeanContext context = BeanContext.run();
        Oven oven = context.getBean(Oven.class);
        oven.turnOn();
    }
}
