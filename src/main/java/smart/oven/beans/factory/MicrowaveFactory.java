package smart.oven.beans.factory;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;

@Factory
public class MicrowaveFactory {

    @Bean
    Microwave microwave() {
        return new Microwave();
    }
}
