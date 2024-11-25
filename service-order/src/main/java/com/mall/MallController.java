package com.mall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author karywoodOyo
 */
@RestController
@RequestMapping("/mall")
@RequiredArgsConstructor
public class MallController {
    final MallService mallService ;
    @GetMapping("/getNumsbyIds/{ids}")
    public Map<String, Object> getNumsbyId(@PathVariable("ids") String ids){
        return Map.of(
                "code", 200,
                "message", "success",
                "ids",mallService.queryItemByIds(ids)
        );
    }

    @GetMapping("/hello/{ids}")
    public Map<String, Object> Hello(@PathVariable("ids") String ids){
        Collection<Long> idsList = Arrays.stream(ids.split(",")).map(Long::parseLong).toList();
        return Map.of(
                "code", 200,
                "message", "success");
        }


}
