package com.example.oembed.codet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Options04TestIQTest {

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(String input, String output) {
        var algorithm  = new Options04TestIQ();
        assertEquals(output, algorithm.test(input));
    }
    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments("2 4 7 8 10", "3 # 7만 홀수"),
            arguments("1 2 1 1", "2 # 2만 짝수")
        );
    }
}