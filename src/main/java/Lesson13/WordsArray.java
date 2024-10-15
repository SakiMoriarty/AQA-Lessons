package Lesson13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordsArray {
    public static void count(String[] wordsArray){
        Map<String, Integer> wordCount = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();

        for (String word : wordsArray) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            uniqueWords.add(word);
        }

        System.out.println("\nСлова и количество их вхождений:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
