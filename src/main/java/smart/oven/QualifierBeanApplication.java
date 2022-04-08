package smart.oven;

import io.micronaut.context.BeanContext;
import smart.oven.helper.Oven;

public class QualifierBeanApplication {

    public static void main(String[] args) {
        BeanContext context = BeanContext.run();
        smart.oven.beans.qualifiers.Oven oven1 = context.getBean(smart.oven.beans.qualifiers.Oven.class);
        oven1.setCookingMode();
    }
}
