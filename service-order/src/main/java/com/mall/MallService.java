package com.mall;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * @author karywoodOyo
 */
public interface MallService {
    Collection<Integer> queryItemByIds(String ids);
}
