package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for(int i: functionMap.values())
            if(i == requiredValue)
                return true;
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : sourceList) {
            map.put(i, i * 5 + 2);
        }
        return map;
    }
}
