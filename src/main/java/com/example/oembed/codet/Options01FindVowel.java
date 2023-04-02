package com.example.oembed.codet;

public class Options01FindVowel {
    public int findVowel(String str) {
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
