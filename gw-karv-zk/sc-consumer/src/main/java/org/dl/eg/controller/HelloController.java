package org.dl.eg.controller;

import lombok.extern.apachecommons.CommonsLog;
import org.dl.eg.feign.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: ty
 **/
@CommonsLog
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloFeignService helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name)  {
        log.info("the name is " + name);
        return helloRemote.hello(name) + "\n" + new Date().toString();
    }

    @GetMapping("/tt")
    public String tt(){
        log.info("the name is tt");
        return helloRemote.hello("test-----") + "\n" + new Date().toString();
    }

}
