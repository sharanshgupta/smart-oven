package smart.oven.beans.scopes;

import jakarta.inject.Singleton;

@Singleton
public class Oven3 {

    private Lights lights;

    public Oven3(Lights lights) {
        System.out.println("Calling Oven3 constructor");
        this.lights = lights;
    }

    public void turnOn() {
        System.out.println("Turning lights on for Oven3");
    }
}
