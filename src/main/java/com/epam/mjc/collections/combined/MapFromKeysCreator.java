package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> setMap = new HashMap<>();

        for (Map.Entry<String,Integer> entry: sourceMap.entrySet()) {

            String key = entry.getKey();
            Integer lengthKey = key.length();

            if (setMap.containsKey(lengthKey)){
                setMap.get(lengthKey).add(key);
            }else {
                Set<String> strings = new HashSet<String>();
                strings.add(key);
                setMap.put(lengthKey,strings);
            }
        }

        return setMap;
    }
}
