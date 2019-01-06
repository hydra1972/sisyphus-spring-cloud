package org.dl.eg.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: ty
 **/
@FeignClient(name = "sc-producer", fallback = HelloFeignProviderHystrix.class)
public interface HelloFeignService {

    /**
     *
     * @param name
     * @return
     */
    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
