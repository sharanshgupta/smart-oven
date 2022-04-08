package smart.oven;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.PropertySource;
import smart.oven.beans.conditionals.ConditionalOven;

import java.util.Map;

public class ConditionalBeanApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = ApplicationContext.run(
                PropertySource.of("default", Map.of("safety.switch.enabled", "true"))
        );
        ConditionalOven conditionalOven = applicationContext.getBean(ConditionalOven.class);
        conditionalOven.setCookingMode();
    }
}
