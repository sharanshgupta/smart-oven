package smart.oven.beans.qualifiers.mode;

import jakarta.inject.Singleton;

@Singleton
public class DefrostingCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Cooking in Defrosting Mode");
    }
}
