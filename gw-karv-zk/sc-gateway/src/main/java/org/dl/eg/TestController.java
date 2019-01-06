package org.dl.eg;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tt")
@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;


    @GetMapping("/a")
    public String hello() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return "Hello!";
    }

}
