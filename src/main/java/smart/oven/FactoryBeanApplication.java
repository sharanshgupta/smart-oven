package smart.oven;

import io.micronaut.context.ApplicationContext;
import smart.oven.beans.factory.CombiOven;

public class FactoryBeanApplication {

    public static void main(String[] args) {

        ApplicationContext context = ApplicationContext.run();
        CombiOven combiOven = context.getBean(CombiOven.class);
        combiOven.turnOnMicrowave();
        combiOven.turnOnOven();
    }
}
