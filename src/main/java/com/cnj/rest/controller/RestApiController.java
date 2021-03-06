package com.cnj.rest.controller;

import java.util.List;

//import static org.mockito.Mockito.RETURNS_SELF;

import java.util.concurrent.atomic.AtomicLong;

import com.cnj.rest.domain.RestApi;
import com.cnj.rest.service.RestApiService;

//import org.aspectj.weaver.World;
//import org.hibernate.boot.registry.classloading.spi.ClassLoaderService.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
    @Autowired
    RestApiService restApiService;

//    @RequestMapping("/greating")
//    public RestApi greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new RestApi(counter.incrementAndGet(),
//                            String.format(template, name));
//    }

    @RequestMapping("/getapi")
    public String getApiContent(@RequestParam(value="name", defaultValue="World") String name) {
      
       // restApiService.getSampleUserList(name);
        List<RestApi> aa = restApiService.getAllRestApi();
        return (String) aa.get(0).getApiName();
        
    }

}
