package com.example.oembed.dto;

import com.example.oembed.vo.MediaType;

public class ContentDto {
    private final String url;
    private final MediaType mediaType;

    private ContentDto(String url, MediaType mediaType) {
        this.url = url;
        this.mediaType = mediaType;
    }

    public static ContentDto of(String url) {
        MediaType media = MediaType.EMPTY;
        if (url.contains("https://www.youtube.com")) {
            media = MediaType.YOUTUBE;
        } else if (url.contains("https://twitter.com")) {
            media = MediaType.TWITTER;
        } else if (url.contains("https://vimeo.com")) {
            media = MediaType.VIMEO;
        }

        return new ContentDto(url, media);
    }

    public String getUrl() {
        return url;
    }

    public MediaType getMediaType() {
        return mediaType;
    }
}
