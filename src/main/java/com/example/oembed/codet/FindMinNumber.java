package com.example.oembed.codet;

import java.util.Arrays;

public class FindMinNumber {
    public int find(int[] numbers){
        Arrays.sort(numbers);
        int result = 0;

        for (int number : numbers) {
            if (result == number) {
                result++;
                continue;
            }

            if (result < number) {
                break;
            }
        }
        return result;
    }
}
