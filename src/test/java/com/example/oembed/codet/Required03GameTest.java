package com.example.oembed.codet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Required03GameTest {

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(String[] games, int result) {
        var victoryPoint = new Required03Game();
        assertEquals(result, victoryPoint.victoryPoint(games));
    }

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(new String[]{"3-1", "2-2", "1-3"}, 4)
        );
    }

}