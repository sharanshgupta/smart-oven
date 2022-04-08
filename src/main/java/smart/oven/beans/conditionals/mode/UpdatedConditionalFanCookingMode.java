package smart.oven.beans.conditionals.mode;

import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Singleton;

@Singleton
@Replaces(ConditionalFanCookingMode.class)
public class UpdatedConditionalFanCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Cooking in Updated conditional Fan Cooking mode");
    }
}
