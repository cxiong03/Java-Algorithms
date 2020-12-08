package com.codewithchang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //        checkMagazine("give me one grand today night", "give one grand today");
    }
    public List<List<String>> wordSearch(String sentence) {
        HashMap<String, String> wordMatch = new HashMap<>() {{
            put("give me one grand today night", "give one grand today");
        }};

        List<List<String>> wordFound = new ArrayList<>();
        String[] wordArray = sentence.split("");
        for (var word : wordArray) {
            wordFound.add(Arrays.asList(word, wordMatch.get(word)));
        }

        return wordFound;
    }

//	    static void checkMagazine(String magazine, String note) {
//            HashMap<String, String> wordMatch = new HashMap<>();
//            String[] noteArray = note.split(" ");
//            for (var word : noteArray) {
//                if (word.equals(" ")) {
//                    continue;
//                }
//
//                if (wordMatch.containsKey(word)) {
//                    wordMatch
//                }
//            }
//
//        }
}
