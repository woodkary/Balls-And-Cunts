package com.mall;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * @author karywoodOyo
 */
@FeignClient(name = "service-store")//指定从哪个服务中调用功能，service-store为被调用者在application配置文件中的名字
@Component
public interface StoreClient {
    @GetMapping("/store/items")
    Collection<Integer> queryItemByIds(@RequestParam("ids")String ids) ;
}

