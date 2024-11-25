package com.mall;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @author karywoodOyo
 */
@Service
@RequiredArgsConstructor
public class MallServiceImpl implements MallService {
    final StoreClient storeClient;
    @Override
    public Collection<Integer> queryItemByIds(String ids) {
        return storeClient.queryItemByIds(ids);
    }
}
