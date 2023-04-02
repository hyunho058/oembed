package com.example.oembed.codet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class QuarterCalculateTest {
    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(int month, int result) {
        var calculator = new QuarterCalculate();
        assertEquals(result, calculator.quarterCalculate(month));
    }

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(3, 1),
            arguments(8, 3),
            arguments(11, 4)
        );
    }
}