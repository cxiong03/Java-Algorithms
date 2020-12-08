package com.codewithchang;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkMagazines("give me one grand today night", "give one grand today"));
        //        checkMagazine("give me one grand today night", "give one grand today");
    }
    static void checkMagazines(String[] magazine, String[] note) {
    Map<String, Integer> magHashMap = new HashMap<String, Integer>();
    Map<String, Integer> noteHashMap = new HashMap<String, Integer>();

        for (int i = 0; i < magazine.length; i++) {
        if (magHashMap.containsKey(magazine[i])) {
            magHashMap.put(magazine[i], magHashMap.get(magazine[i]) +1);
        } else {
            magHashMap.put(magazine[i], 1);
        }
    }

        for (int i = 0; i < note.length; i++) {
        if (noteHashMap.containsKey(note[i])) {
            noteHashMap.put(note[i], noteHashMap.get(note[i]) +1);
        } else {
            noteHashMap.put(note[i], 1);
        }
    }

        for (String word : noteHashMap.keySet()) {
        if (!magHashMap.containsKey(word)) {
            System.out.println("No");
            return;
        }

        if (magHashMap.get(word) < noteHashMap.get(word)) {
            System.out.println("No");
            return;
        }
    }
            System.out.println("Yes");
            return;
}


//    public List<List<String>> wordSearch(String sentence) {
//        HashMap<String, String> wordMatch = new HashMap<>() {{
//            put("give me one grand today night", "give one grand today");
//        }};
//
//        List<List<String>> wordFound = new ArrayList<>();
//        String[] wordArray = sentence.split("");
//        for (var word : wordArray) {
//            wordFound.add(Arrays.asList(word, wordMatch.get(word)));
//        }
//
//        return wordFound;
//    }

//    ------------------------------

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
