package smart.oven.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class OvenController {




    @Get("/status/{ovenId}")
    /*
        public String getOvenStatus(String id) - This will cause error, we all know,
        but the point at which this error will be thrown is important.
        In Spring the error would come when JIT actually has the need to compile this method,
        i.e. at runtime.
        In Micronaut, AOT compiler will throw this error at compile time only.
    */
    public String getOvenStatus(String ovenId) {
        return "OK" + ovenId;
    }
}
