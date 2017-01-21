package com.stock.core.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * User: huacy
 * Date: 2017/1/21
 * Time: 14:00
 */
@Slf4j
@Component
public class LocalCache {

    private static Cache<String, String> cache = CacheBuilder.newBuilder()
            .maximumSize(Integer.MAX_VALUE).expireAfterWrite(8, TimeUnit.HOURS).build();

    public static void putCache(String key, String value) {
        cache.put(key, value);
    }

    public static Object getCache(String key) {
        return cache.getIfPresent(key);
    }
}
