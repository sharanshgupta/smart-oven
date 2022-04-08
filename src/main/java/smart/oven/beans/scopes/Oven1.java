package smart.oven.beans.scopes;

import jakarta.inject.Singleton;

@Singleton
public class Oven1 {

    private Lights lights;

    public Oven1(Lights lights) {
        System.out.println("Calling Oven1 constructor");
        this.lights = lights;
    }

    public void turnOn() {
        System.out.println("Turning lights on for Oven1");
    }
}
