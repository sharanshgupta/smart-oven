package smart.oven.beans.scopes;

import jakarta.inject.Singleton;

@Singleton
public class Oven2 {

    private Lights lights;

    public Oven2(Lights lights) {
        System.out.println("Calling Oven2 constructor");
        this.lights = lights;
    }

    public void turnOn() {
        System.out.println("Turning lights on for Oven2");
    }
}
