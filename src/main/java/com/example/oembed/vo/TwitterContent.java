package com.example.oembed.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class TwitterContent {

    public String url;
    @JsonProperty("author_name")
    private String authorName;
    @JsonProperty("author_url")
    private String authorUrl;
    private String html;
    private String width;
    private String height;
    private String type;
    @JsonProperty("cache_age")
    private String cacheAge;
    @JsonProperty("provider_name")
    private String providerName;
    @JsonProperty("provider_url")
    private String providerUrl;
    private double version;
}
