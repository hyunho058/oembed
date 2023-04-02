package com.example.oembed.codet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Options03FriendTest {
    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(String[] input, String[] output) {
        var algorithm = new Options03Friend();
        assertArrayEquals(output, algorithm.find(input));
    }

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(new String[]{"Ryan", "Kieran", "Mark"}, new String[]{"Ryan", "Mark"}),
            arguments(new String[]{"Ryan", "Kier", "Mark"}, new String[]{"Ryan", "Kier", "Mark"})
        );
    }
}