package com.mall.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping
public class StoreController {

    @Value("${server.port}")
    String port;

    @GetMapping("/{goodId}")
    public Long GetGoodNum(@PathVariable String goodId){
        System.out.println("当前正在"+port+"请求服务");

        return 1L;
    }

    @GetMapping("/items")
     public Collection<Integer> queryItemByIds(@RequestParam("ids") Collection<Long> ids) {
        return List.of(1, 2, 3);
    }

}
