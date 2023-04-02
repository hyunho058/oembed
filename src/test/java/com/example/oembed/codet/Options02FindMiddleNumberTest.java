package com.example.oembed.codet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Options02FindMiddleNumberTest {

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(int[] input, int result){
        var algorithm = new Options02FindMiddleNumber();
        assertEquals(result, algorithm.find(input));
    }
    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(new int[]{0, 1, 2}, 1),
            arguments(new int[]{5, 1, 2}, 2),
            arguments(new int[]{8, 1, 4}, 4)
        );
    }
}