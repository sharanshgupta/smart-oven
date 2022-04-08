package smart.oven.beans.scopes;

import io.micronaut.context.annotation.Context;
import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Singleton
//@Context
public class Lights {

    public Lights() {
        System.out.println("Calling Lights constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Calling Lights @PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Calling Lights @PreDestroy");
    }
}
