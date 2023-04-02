package com.example.oembed.infra.feign;

import com.example.oembed.vo.YoutubeContent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "youtube", url = "https://www.youtube.com/oembed")
public interface YoutubeClient {
    @GetMapping("?url={url}")
    YoutubeContent getContent(
        @PathVariable("url") String url
    );
}
