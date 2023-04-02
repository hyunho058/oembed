package com.example.oembed.codet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NewLineTest {
    @ParameterizedTest
    @MethodSource("inputAndResult")
    void solution(String input, String result) {
        var algorithm = new NewLine();
        assertEquals(result, algorithm.solution(input));
    }

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments("이 글은 도커에 대해 1도 모르는 시스템 관리자나 서버 개발자를 대상으로 도커 전반에 대해 얕고 넓은 지식을 담고 있습니다. 도커가 등장한 배경과 도커의 역사, 그리고 도커의 핵심 개념인 컨테이너와 이미지에 대해 알아보고 실제로 도커를 설치하고 컨테이너를 실행해 보도록 하겠습니다.",
                "이 글은 도커에 대해 1도 모르는 시스템 관리자나 서버 개발자를 대상으로 도커 전반\n" +
                    "에 대해 얕고 넓은 지식을 담고 있습니다. 도커가 등장한 배경과 도커의 역사, 그리고\n" +
                    "도커의 핵심 개념인 컨테이너와 이미지에 대해 알아보고 실제로 도커를 설치하고 컨테\n" +
                    "이너를 실행해 보도록 하겠습니다.")
        );
    }

    @Test
    void 한글_포함_테스트(){
        var algorithm = new NewLine();
        assertTrue(algorithm.isKorean('가'));
        assertTrue(algorithm.isKorean('쀍'));
        assertTrue(algorithm.isKorean('핳'));
        assertFalse(algorithm.isKorean(' '));
        assertFalse(algorithm.isKorean(','));
        assertFalse(algorithm.isKorean('?'));
        assertFalse(algorithm.isKorean('A'));
        assertFalse(algorithm.isKorean('z'));
    }
}