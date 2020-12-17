package com.codewithchang;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String secretWord = "Tenet";

        byte[] strAsByteArray = secretWord.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i -1];
            System.out.println(new String(result));
        }
    }
}
