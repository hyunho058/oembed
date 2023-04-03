package com.example.oembed.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class YoutubeContent {
    private String title;
    @JsonProperty("author_name")
    private String authorName;
    @JsonProperty("author_url")
    private String authorUrl;
    private String type;
    private String height;
    private String width;
    private double version;
    @JsonProperty("provider_name")
    private String providerName;
    @JsonProperty("provider_url")
    private String providerUrl;
    @JsonProperty("thumbnail_height")
    private String thumbnailHeight;
    @JsonProperty("thumbnail_width")
    private String thumbnailWidth;
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;
    private String html;
}
