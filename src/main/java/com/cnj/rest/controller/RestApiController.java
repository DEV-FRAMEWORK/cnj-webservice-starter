package com.cnj.rest.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.cnj.rest.domain.RestApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hellapi")
    public RestApi greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new RestApi(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
