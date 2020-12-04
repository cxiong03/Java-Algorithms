package com.codewithchang;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        checkMagazine("give me one grand today night", "give one grand today");
    }
	    static void checkMagazine(String magazine, String note) {
            HashMap<String, String> wordMatch = new HashMap<>();
            String[] noteArray = note.split(" ");
            for (var word : noteArray) {
                if (word.equals(" ")) {
                    continue;
                }

                if (wordMatch.containsKey(word)) {
                    wordMatch
                }
            }

        }
}
