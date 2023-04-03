package com.example.oembed.dto;

import com.example.oembed.vo.TwitterContent;
import com.example.oembed.vo.VimeoContent;
import com.example.oembed.vo.YoutubeContent;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

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
    private String htmlWidthPerHeight;
    private String thumbnailWidthPerHeight;

    public ContentView(String type,
                       double version,
                       String providerName,
                       String providerUrl,
                       String title,
                       String authorName,
                       String authorUrl,
                       String isPlus,
                       String accountType,
                       String html,
                       String width,
                       String height,
                       String duration,
                       String description,
                       String thumbnailUrl,
                       String thumbnailWidth,
                       String thumbnailHeight,
                       String thumbnailUrlWithPlayButton,
                       String uploadDate,
                       String videoId,
                       String uri,
                       String htmlWidthPerHeight,
                       String thumbnailWidthPerHeight) {
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
        this.htmlWidthPerHeight = htmlWidthPerHeight;
        this.thumbnailWidthPerHeight = thumbnailWidthPerHeight;
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
                content.getUri(),
                content.getWidth() + "/" + content.getHeight(),
                content.getThumbnailWidth() + "/" + content.getThumbnailHeight()
        );
    }

    private ContentView(String type,
                        double version,
                        String providerName,
                        String providerUrl,
                        String title,
                        String authorName,
                        String authorUrl,
                        String html,
                        String width,
                        String height,
                        String thumbnailUrl,
                        String thumbnailWidth,
                        String thumbnailHeight,
                        String htmlWidthPerHeight,
                        String thumbnailWidthPerHeight) {
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
        this.htmlWidthPerHeight = htmlWidthPerHeight;
        this.thumbnailWidthPerHeight = thumbnailWidthPerHeight;
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
                content.getThumbnailHeight(),
                content.getWidth() + "/" + content.getHeight(),
                content.getThumbnailWidth() + "/" + content.getThumbnailHeight()
        );
    }

    public ContentView(String type,
                       double version,
                       String providerName,
                       String providerUrl,
                       String authorName,
                       String authorUrl,
                       String html,
                       String width,
                       String height,
                       String uri,
                       String htmlWidthPerHeight) {
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
        this.htmlWidthPerHeight = htmlWidthPerHeight;;
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
                content.getUrl(),
                content.getWidth() +"/"+ content.getHeight()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContentView that = (ContentView) o;

        if (Double.compare(that.version, version) != 0) return false;
        if (!Objects.equals(type, that.type)) return false;
        if (!Objects.equals(providerName, that.providerName)) return false;
        if (!Objects.equals(providerUrl, that.providerUrl)) return false;
        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(authorName, that.authorName)) return false;
        if (!Objects.equals(authorUrl, that.authorUrl)) return false;
        if (!Objects.equals(isPlus, that.isPlus)) return false;
        if (!Objects.equals(accountType, that.accountType)) return false;
        if (!Objects.equals(html, that.html)) return false;
        if (!Objects.equals(width, that.width)) return false;
        if (!Objects.equals(height, that.height)) return false;
        if (!Objects.equals(duration, that.duration)) return false;
        if (!Objects.equals(description, that.description)) return false;
        if (!Objects.equals(thumbnailUrl, that.thumbnailUrl)) return false;
        if (!Objects.equals(thumbnailWidth, that.thumbnailWidth))
            return false;
        if (!Objects.equals(thumbnailHeight, that.thumbnailHeight))
            return false;
        if (!Objects.equals(thumbnailUrlWithPlayButton, that.thumbnailUrlWithPlayButton))
            return false;
        if (!Objects.equals(uploadDate, that.uploadDate)) return false;
        if (!Objects.equals(videoId, that.videoId)) return false;
        if (!Objects.equals(uri, that.uri)) return false;
        if (!Objects.equals(htmlWidthPerHeight, that.htmlWidthPerHeight))
            return false;
        return Objects.equals(thumbnailWidthPerHeight, that.thumbnailWidthPerHeight);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        temp = Double.doubleToLongBits(version);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (providerName != null ? providerName.hashCode() : 0);
        result = 31 * result + (providerUrl != null ? providerUrl.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + (authorUrl != null ? authorUrl.hashCode() : 0);
        result = 31 * result + (isPlus != null ? isPlus.hashCode() : 0);
        result = 31 * result + (accountType != null ? accountType.hashCode() : 0);
        result = 31 * result + (html != null ? html.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (thumbnailUrl != null ? thumbnailUrl.hashCode() : 0);
        result = 31 * result + (thumbnailWidth != null ? thumbnailWidth.hashCode() : 0);
        result = 31 * result + (thumbnailHeight != null ? thumbnailHeight.hashCode() : 0);
        result = 31 * result + (thumbnailUrlWithPlayButton != null ? thumbnailUrlWithPlayButton.hashCode() : 0);
        result = 31 * result + (uploadDate != null ? uploadDate.hashCode() : 0);
        result = 31 * result + (videoId != null ? videoId.hashCode() : 0);
        result = 31 * result + (uri != null ? uri.hashCode() : 0);
        result = 31 * result + (htmlWidthPerHeight != null ? htmlWidthPerHeight.hashCode() : 0);
        result = 31 * result + (thumbnailWidthPerHeight != null ? thumbnailWidthPerHeight.hashCode() : 0);
        return result;
    }
}
