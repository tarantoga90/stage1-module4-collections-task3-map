package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();

        if (sentence.isEmpty()) {
            return resultMap;
        }

        String[] wordArray = sentence.toLowerCase()
                .replaceAll("\\p{Punct}", "")
                .split(" ");

        for (String word : wordArray) {
            if (!resultMap.containsKey(word)) {
                resultMap.put(word, 1);
            } else {
                resultMap.put(word, resultMap.get(word) + 1);
            }
        }

        return resultMap;
    }
}
