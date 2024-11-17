package org.example.consumerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    private final ProviderClient providerClient;

    public ConsumerController(ProviderClient providerClient) {
        this.providerClient = providerClient;
    }

    @GetMapping("/consumer/hello")
    public String sayHello() {
        return "Consumer received: " + providerClient.getHelloMessage();
    }
}
