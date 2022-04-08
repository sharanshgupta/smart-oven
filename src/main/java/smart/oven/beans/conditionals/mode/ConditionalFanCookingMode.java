package smart.oven.beans.conditionals.mode;

import jakarta.inject.Singleton;

@Singleton
public class ConditionalFanCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Cooking in conditional Fan Cooking mode");
    }
}
