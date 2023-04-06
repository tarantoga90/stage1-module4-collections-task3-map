package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        if (functionMap.isEmpty()) {
            return false;
        }

        List<Integer> list = functionMap.values()
                .parallelStream()
                .filter((Integer i) -> i == requiredValue)
                .collect(Collectors.toList());

        return !list.isEmpty();
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();

        if (sourceList.isEmpty()) {
            return functionMap;
        }

        sourceList.forEach((Integer number) -> {
            functionMap.put(number, number * 5 + 2);
        });

        return functionMap;
    }
}
