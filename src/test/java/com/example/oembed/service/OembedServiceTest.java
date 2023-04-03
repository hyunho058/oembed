package com.example.oembed.service;

import com.example.oembed.dto.ContentDto;
import com.example.oembed.dto.ContentView;
import com.example.oembed.infra.feign.TwitterClient;
import com.example.oembed.infra.feign.VimeoClient;
import com.example.oembed.infra.feign.YoutubeClient;
import com.example.oembed.vo.TwitterContent;
import com.example.oembed.vo.VimeoContent;
import com.example.oembed.vo.YoutubeContent;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OembedServiceTest {
    @InjectMocks
    private OembedService oembedService;
    @Mock
    private YoutubeClient youtubeClient;
    @Mock
    private VimeoClient vimeoClient;
    @Mock
    private TwitterClient twitterClient;
    private final Gson gson = new Gson();

    @Test
    void JSON_파일_변환_테스트() throws FileNotFoundException {
        BufferedReader exhibitionInfoBuffer =
            new BufferedReader(new FileReader("src/test/resources/oembed-json/youtube.json"));
        YoutubeContent youtubeContent = gson.fromJson(exhibitionInfoBuffer, YoutubeContent.class);

        assertEquals("video", youtubeContent.getType());
    }

    @Test
    void youtube_oembed_호출_성공() throws FileNotFoundException {
        //given
        BufferedReader exhibitionInfoBuffer =
            new BufferedReader(new FileReader("src/test/resources/oembed-json/youtube.json"));

        YoutubeContent youtubeContent = gson.fromJson(exhibitionInfoBuffer, YoutubeContent.class);
        String requestUrl = "https://www.youtube.com/watch?v=dBD54EZIrZo";

        when(youtubeClient.getContent(requestUrl)).thenReturn(youtubeContent);

        //when
        ContentView contents = oembedService.getContents(ContentDto.of(requestUrl));

        //then
        assertEquals(ContentView.youtubeOf(youtubeContent), contents);
        verify(youtubeClient, times(1)).getContent(requestUrl);
    }

    @Test
    void twitter_oembed_호출_성공() throws FileNotFoundException {
        //given
        BufferedReader exhibitionInfoBuffer =
            new BufferedReader(new FileReader("src/test/resources/oembed-json/twitter.json"));

        TwitterContent twitterContent = gson.fromJson(exhibitionInfoBuffer, TwitterContent.class);
        String requestUrl = "https://twitter.com/hellopolicy/status/867177144815804416";

        when(twitterClient.getContent(requestUrl)).thenReturn(twitterContent);

        //when
        ContentView contents = oembedService.getContents(ContentDto.of(requestUrl));

        //then
        assertEquals(ContentView.twitterOf(twitterContent), contents);
        verify(twitterClient, times(1)).getContent(requestUrl);
    }

    @Test
    void vimeo_oembed_호출_성공() throws FileNotFoundException {
        //given
        BufferedReader exhibitionInfoBuffer =
            new BufferedReader(new FileReader("src/test/resources/oembed-json/vimeo.json"));

        VimeoContent vimeoContent = gson.fromJson(exhibitionInfoBuffer, VimeoContent.class);
        String requestUrl = "https://vimeo.com/20097015";

        when(vimeoClient.getContent(requestUrl)).thenReturn(vimeoContent);

        //when
        ContentView contents = oembedService.getContents(ContentDto.of(requestUrl));

        //then
        assertEquals(ContentView.vimeoOf(vimeoContent), contents);
        verify(vimeoClient, times(1)).getContent(requestUrl);
    }

    @Test
    void 잘못된_요청() {
        //given
        String requestUrl = "test";

        //when, then
        assertThrows(
            IllegalArgumentException.class,
            () -> oembedService.getContents(ContentDto.of(requestUrl)));
    }
}
