package com.example.oembed.codet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Required02FindMinNumberTest {
    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(int[] numbers, int result) {
        var algorithm = new Required02FindMinNumber();
        assertEquals(result, algorithm.find(numbers));
    }

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(new int[]{0, 1, 2, 4}, 3),
            arguments(new int[]{0, 1, 1, 1, 2, 4}, 3),
            arguments(new int[]{4, 2, 5, 1}, 0),
            arguments(new int[]{4, 2, 5, 1, 0}, 3),
            arguments(new int[]{0, 0, 0, 0, 0, 0}, 1),
            arguments(new int[]{1, 1, 1, 1, 2, 4}, 0),
            arguments(new int[]{0, 1, 2, 3, 4, 5, 6}, 7)
        );
    }
}