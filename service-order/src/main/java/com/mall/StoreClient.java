package com.mall;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * @author karywoodOyo
 */
@FeignClient(name = "service-store")
public interface StoreClient {
    @GetMapping("/items")
    Collection<Integer> queryItemByIds(@RequestParam("ids") Collection<Long> ids) ;
}

