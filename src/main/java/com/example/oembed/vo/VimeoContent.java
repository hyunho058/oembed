package com.example.oembed.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VimeoContent {
    private String type;
    private double version;
    @JsonProperty("provider_name")
    private String providerName;
    @JsonProperty("provider_url")
    private String providerUrl;
    private String title;
    @JsonProperty("author_name")
    private String authorName;
    @JsonProperty("author_url")
    private String authorUrl;
    @JsonProperty("is_plus")
    private String isPlus;
    @JsonProperty("account_type")
    private String accountType;
    private String html;
    private String width;
    private String height;
    private String duration;
    private String description;
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;
    @JsonProperty("thumbnail_width")
    private String thumbnailWidth;
    @JsonProperty("thumbnail_height")
    private String thumbnailHeight;
    @JsonProperty("thumbnail_url_with_play_button")
    private String thumbnailUrlWithPlayButton;
    @JsonProperty("upload_date")
    private String uploadDate;
    @JsonProperty("video_id")
    private String videoId;
    private String uri;

}
