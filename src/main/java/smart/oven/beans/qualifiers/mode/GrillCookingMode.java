package smart.oven.beans.qualifiers.mode;

import jakarta.inject.Singleton;

@Singleton
public class GrillCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Cooking in Grill Mode");
    }
}
