package org.example.providerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProviderController {
    @GetMapping("/provider/hello")
    public String sayHello() {
        return "Hello from Provider Service!";
    }
}

