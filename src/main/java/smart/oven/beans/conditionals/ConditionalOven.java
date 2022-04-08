package smart.oven.beans.conditionals;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import smart.oven.beans.conditionals.mode.CookingMode;

@Singleton
@Requires(property = "safety.switch.enabled", value = "true")
public class ConditionalOven {

    private CookingMode cookingMode;

    @Inject
    public ConditionalOven(CookingMode cookingMode) {
        this.cookingMode = cookingMode;
    }

    public void setCookingMode() {
        cookingMode.setCookingMode();
    }
}
