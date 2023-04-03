package com.example.oembed.codet;


public class Required04NewLine {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int characterCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isKorean(c)) {
                if (characterCount >= 79) {
                    sb.append("\n");
                    characterCount = 0;
                }
                characterCount += 2;
                sb.append(c);
                continue;
            }

            if (characterCount == 80) {
                sb.append("\n");
                characterCount = 0;
            }

            if (isFirstSpace(characterCount, c)) {
                continue;
            }

            characterCount++;
            sb.append(c);
        }

        return sb.toString();
    }

    public boolean isKorean(char c) {
        return c >= '가' && c <= '힣';
    }

    private boolean isFirstSpace(int characterCount, char character) {
        return characterCount == 0 && character == ' ';
    }
}
