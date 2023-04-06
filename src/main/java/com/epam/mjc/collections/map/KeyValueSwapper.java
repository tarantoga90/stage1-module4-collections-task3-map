package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();

        if (sourceMap.isEmpty()) {
            return resultMap;
        }

        sourceMap.forEach((Integer number, String word) -> {
            if (!resultMap.containsKey(word)) {
                resultMap.put(word, number);
            } else {
                if (resultMap.get(word) > number) {
                    resultMap.put(word, number);
                }
            }
        });

        return resultMap;
    }
}
