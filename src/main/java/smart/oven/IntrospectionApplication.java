package smart.oven;

import io.micronaut.core.beans.BeanIntrospection;
import smart.oven.beans.instropection.Meal;

public class IntrospectionApplication {

    public static void main(String[] args) {
        BeanIntrospection<Meal> introspection = BeanIntrospection.getIntrospection(Meal.class);

        Meal pizza = introspection.instantiate("Pizza", 300, 40);
        System.out.println("Cooking " + pizza.getName());
    }
}
