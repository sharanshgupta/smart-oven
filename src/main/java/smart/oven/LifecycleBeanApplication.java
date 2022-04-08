package smart.oven;

import io.micronaut.context.ApplicationContext;
import smart.oven.beans.scopes.Oven1;
import smart.oven.beans.scopes.Oven2;
import smart.oven.beans.scopes.Oven3;

public class LifecycleBeanApplication {

    public static void main(String[] args) {
        ApplicationContext context = ApplicationContext.run();
        System.out.println("Application started");

        Oven1 oven1 = context.getBean(Oven1.class);
        Oven2 oven2 = context.getBean(Oven2.class);
        Oven3 oven3 = context.getBean(Oven3.class);

        oven1.turnOn();
        oven2.turnOn();
        oven3.turnOn();

        context.stop();
        System.out.println("Application stopped");
    }
}
