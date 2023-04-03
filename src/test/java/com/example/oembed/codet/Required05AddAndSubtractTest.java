package com.example.oembed.codet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Required05AddAndSubtractTest {
    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(int input, String result) {
        var algorithm = new Required05AddAndSubtract();

        assertEquals(result, algorithm.findFruit(input));
    }

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(8, "pineapple"),
            arguments(10, "apple"),
            arguments(325, "apple"),
            arguments(10000, "apple"),
            arguments(276, "apple"),
            arguments(111, "apple"),
            arguments(52, "apple")
        );
    }
}