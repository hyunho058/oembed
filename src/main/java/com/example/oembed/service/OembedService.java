package com.example.oembed.service;

import com.example.oembed.dto.ContentDto;
import com.example.oembed.dto.ContentView;
import com.example.oembed.infra.feign.TwitterClient;
import com.example.oembed.infra.feign.VimeoClient;
import com.example.oembed.infra.feign.YoutubeClient;
import com.example.oembed.vo.TwitterContent;
import com.example.oembed.vo.VimeoContent;
import com.example.oembed.vo.YoutubeContent;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class OembedService {
    private final YoutubeClient youtubeClient;
    private final TwitterClient twitterClient;
    private final VimeoClient vimeoClient;

    public ContentView getContents(ContentDto request) {
        String url = request.getUrl();
        ContentView contentView = null;

        switch (request.getMediaType()) {
            case YOUTUBE:
                YoutubeContent youtubeContent = youtubeClient.getContent(url);
                contentView = ContentView.youtubeOf(youtubeContent);
                break;
            case TWITTER:
                TwitterContent twitterContent = twitterClient.getContent(url);
                contentView = ContentView.twitterOf(twitterContent);
                break;
            case VIMEO:
                VimeoContent vimeoContent = vimeoClient.getContent(url);
                contentView = ContentView.vimeoOf(vimeoContent);
                break;
            case EMPTY:
                throw new IllegalArgumentException("유효한 서비스가 아닙니다");
        }

        return contentView;
    }
}
