package smart.oven.helper;

import jakarta.inject.Singleton;

@Singleton
public class Lights {

    public void turnOn() {
        System.out.println("Turned on Lights");
    }
}
