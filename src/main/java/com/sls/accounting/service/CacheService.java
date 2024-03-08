package com.sls.accounting.service;

import com.google.common.cache.Cache;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalListeners;

@Service
public class CacheService {

    private final Map<String, Object> cache = new ConcurrentHashMap<>();

    // LRU cache eviction
//    private final Cache<String, Object> cache = CacheBuilder.newBuilder()
//            .maximumSize(100)
//            .removalListener(RemovalListeners.asynchronous())
//            .build();

}