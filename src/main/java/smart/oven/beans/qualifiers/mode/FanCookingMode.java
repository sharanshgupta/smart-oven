package smart.oven.beans.qualifiers.mode;

import jakarta.inject.Singleton;

@Singleton
public class FanCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Cooking in Fan Mode");
    }
}
