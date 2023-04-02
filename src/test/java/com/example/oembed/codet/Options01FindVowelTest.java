package com.example.oembed.codet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Options01FindVowelTest {

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(String input, int output){
        var algorithm = new Options01FindVowel();
        Assertions.assertEquals(output, algorithm.findVowel(input));
    }

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            Arguments.arguments("abracadabra", 5),
            Arguments.arguments("kkqpjhgbni", 1),
            Arguments.arguments("aeioua", 6),
            Arguments.arguments("kmzxcvwq", 0)
        );
    }
}