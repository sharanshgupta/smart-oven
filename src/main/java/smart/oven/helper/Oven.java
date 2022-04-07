package smart.oven.helper;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Oven {

    private Lights lights;
    private Grill grill;

    @Inject
    public Oven(Lights lights, Grill grill) {
        this.lights = lights;
        this.grill = grill;
    }

    public void turnOn() {
        System.out.println("Turning on Oven");
        lights.turnOn();
        grill.turnOn();
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public Grill getGrill() {
        return grill;
    }

    public void setGrill(Grill grill) {
        this.grill = grill;
    }
}
