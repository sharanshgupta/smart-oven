package smart.oven.helper;

import jakarta.inject.Singleton;

@Singleton
public class Grill {

    public void turnOn() {
        System.out.println("Turned on Grill");
    }
}
