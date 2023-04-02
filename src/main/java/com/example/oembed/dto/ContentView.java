package com.example.oembed.dto;

import com.example.oembed.vo.TwitterContent;
import com.example.oembed.vo.VimeoContent;
import com.example.oembed.vo.YoutubeContent;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ContentView {
    private String type;
    private double version;
    private String providerName;
    private String providerUrl;
    private String title;
    private String authorName;
    private String authorUrl;
    private String isPlus;
    private String accountType;
    private String html;
    private String width;
    private String height;
    private String duration;
    private String description;
    private String thumbnailUrl;
    private String thumbnailWidth;
    private String thumbnailHeight;
    private String thumbnailUrlWithPlayButton;
    private String uploadDate;
    private String videoId;
    private String uri;

    public ContentView(String type,
                       double version,
                       String providerName,
                       String providerUrl,
                       String title,
                       String authorName,
                       String authorUrl, String isPlus, String accountType, String html, String width, String height, String duration, String description, String thumbnailUrl, String thumbnailWidth, String thumbnailHeight, String thumbnailUrlWithPlayButton, String uploadDate, String videoId, String uri) {
        this.type = type;
        this.version = version;
        this.providerName = providerName;
        this.providerUrl = providerUrl;
        this.title = title;
        this.authorName = authorName;
        this.authorUrl = authorUrl;
        this.isPlus = isPlus;
        this.accountType = accountType;
        this.html = html;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.thumbnailWidth = thumbnailWidth;
        this.thumbnailHeight = thumbnailHeight;
        this.thumbnailUrlWithPlayButton = thumbnailUrlWithPlayButton;
        this.uploadDate = uploadDate;
        this.videoId = videoId;
        this.uri = uri;
    }

    public static ContentView vimeoOf(VimeoContent content) {
        return new ContentView(
            content.getType(),
            content.getVersion(),
            content.getProviderName(),
            content.getProviderUrl(),
            content.getTitle(),
            content.getAuthorName(),
            content.getAuthorUrl(),
            content.getIsPlus(),
            content.getAccountType(),
            content.getHtml(),
            content.getWidth(),
            content.getHeight(),
            content.getDuration(),
            content.getDescription(),
            content.getThumbnailUrl(),
            content.getThumbnailWidth(),
            content.getThumbnailHeight(),
            content.getThumbnailUrlWithPlayButton(),
            content.getUploadDate(),
            content.getVideoId(),
            content.getUri()
        );
    }

    private ContentView(String type, double version, String providerName, String providerUrl, String title, String authorName, String authorUrl, String html, String width, String height, String thumbnailUrl, String thumbnailWidth, String thumbnailHeight) {
        this.type = type;
        this.version = version;
        this.providerName = providerName;
        this.providerUrl = providerUrl;
        this.title = title;
        this.authorName = authorName;
        this.authorUrl = authorUrl;
        this.html = html;
        this.width = width;
        this.height = height;
        this.thumbnailUrl = thumbnailUrl;
        this.thumbnailWidth = thumbnailWidth;
        this.thumbnailHeight = thumbnailHeight;
    }

    public static ContentView youtubeOf(YoutubeContent content) {
        return new ContentView(
            content.getType(),
            content.getVersion(),
            content.getProviderName(),
            content.getProviderUrl(),
            content.getTitle(),
            content.getAuthorName(),
            content.getAuthorUrl(),
            content.getHtml(),
            content.getWidth(),
            content.getHeight(),
            content.getThumbnailUrl(),
            content.getThumbnailWidth(),
            content.getThumbnailHeight()
        );
    }

    public ContentView(String type, double version, String providerName, String providerUrl, String authorName, String authorUrl, String html, String width, String height, String uri) {
        this.type = type;
        this.version = version;
        this.providerName = providerName;
        this.providerUrl = providerUrl;
        this.authorName = authorName;
        this.authorUrl = authorUrl;
        this.html = html;
        this.width = width;
        this.height = height;
        this.uri = uri;
    }

    public static ContentView twitterOf(TwitterContent content) {
        return new ContentView(
            content.getType(),
            content.getVersion(),
            content.getProviderName(),
            content.getProviderUrl(),
            content.getAuthorName(),
            content.getAuthorUrl(),
            content.getHtml(),
            content.getWidth(),
            content.getHeight(),
            content.url
        );
    }
}
