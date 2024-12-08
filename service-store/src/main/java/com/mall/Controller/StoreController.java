package com.mall.Controller;

import com.mall.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Value("${server.port}")
    String port;

//    @GetMapping("/test/{goodId}")
//    public Long GetGoodNum(@PathVariable String goodId){
//        System.out.println("当前正在"+port+"请求服务");
//
//        return 1L;
//    }

    @GetMapping("/items")
     public Collection<Integer> queryItemByIds(@RequestParam("ids") String ids) {
        return Arrays.stream(ids.split("-")).map(Integer::parseInt).toList();
    }

    @GetMapping("/order")
    public R getOrder() {
        return R.success(System.currentTimeMillis()/1000);
    }

}
