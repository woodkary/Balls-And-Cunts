package org.example.consumerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider-service")
public interface ProviderClient {
    @GetMapping("/provider/hello")
    String getHelloMessage();
}
