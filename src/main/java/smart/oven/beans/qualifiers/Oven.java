package smart.oven.beans.qualifiers;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import smart.oven.beans.qualifiers.mode.CookingMode;

@Singleton
//@Requires(property = "safety.switch.enabled", value = "true") -- feature flag example
public class Oven {

    private CookingMode cookingMode;

    @Inject
//    public Oven(@Named("Fan") CookingMode cookingMode) {
    public Oven(@Defrosting CookingMode cookingMode) {
        this.cookingMode = cookingMode;
    }

    public void setCookingMode() {
        cookingMode.setCookingMode();
    }
}
