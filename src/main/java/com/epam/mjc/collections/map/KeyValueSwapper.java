package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.HashMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapMap = new HashMap<>();
        for(int i: sourceMap.keySet()){
            if(!swapMap.containsKey(sourceMap.get(i)))
                swapMap.put(sourceMap.get(i), i);
            else{
                swapMap.put(sourceMap.get(i), i > swapMap.get(sourceMap.get(i)) ? swapMap.get(sourceMap.get(i)) : i);
            }
        }
        return swapMap;
    }
}
