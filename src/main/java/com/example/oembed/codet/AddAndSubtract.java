package com.example.oembed.codet;

public class AddAndSubtract {
    public String findFruit(int num) {

        String[] fruits = {"kiwi", "pear", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple"};
        int result = num;

        while (result > 9) {
            String numStr = String.valueOf(result);
            int sumOfElements = 0;

            for (int i = 0; i < numStr.length(); i++) {
                sumOfElements += Character.getNumericValue(numStr.charAt(i));
            }

            result -= sumOfElements;
        }

        return fruits[result-1];
    }
}
