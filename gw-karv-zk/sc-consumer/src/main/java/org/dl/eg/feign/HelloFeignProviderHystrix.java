package org.dl.eg.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: ty
 **/
@Component
public class HelloFeignProviderHystrix implements HelloFeignService {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello World! error";
    }

}
