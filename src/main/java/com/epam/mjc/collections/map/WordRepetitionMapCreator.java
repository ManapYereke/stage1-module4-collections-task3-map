package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();
        String[] words = this.getStrings(sentence);
        for (String word : words) {
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordMap;
    }

    public String[] getStrings(String sentence) {
        Pattern pattern = Pattern.compile("[^a-zA-Z]+");
        String[] words = sentence.toLowerCase().split(" ");
        for(int i = 0; i < words.length; i++) {
            words[i] = pattern.matcher(words[i]).replaceAll("");
        }
        return words;
    }
}
