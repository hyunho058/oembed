package com.example.oembed.codet;

import java.util.Arrays;

public class Options02FindMiddleNumber {
    public int find(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[1];
    }
}
