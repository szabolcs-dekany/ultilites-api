package org.indium.space;

import io.micronaut.http.annotation.*;

@Controller("/ultilitesApi")
public class UltilitesApiController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}