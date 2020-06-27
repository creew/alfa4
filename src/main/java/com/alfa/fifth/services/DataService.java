package com.alfa.fifth.services;

import com.alfa.fifth.dto.PromoMatrix;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class DataService {

    private AtomicInteger val = new AtomicInteger();

    private Map<Integer, PromoMatrix> map = new ConcurrentHashMap<>();

    public int pushMatrix(PromoMatrix matrix) {
        int id = val.getAndIncrement();
        map.put(id, matrix);
        return id;
    }

    public int pushMatrix(int id, PromoMatrix matrix) {
        map.put(id, matrix);
        return id;
    }

    public PromoMatrix getMatrix(int parseInt) {
        return map.get(parseInt);
    }
}
