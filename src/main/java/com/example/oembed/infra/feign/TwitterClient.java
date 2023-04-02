package com.example.oembed.infra.feign;


import com.example.oembed.vo.TwitterContent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "twitter", url = "https://publish.twitter.com/oembed")
public interface TwitterClient {
    @GetMapping("?url={url}")
    TwitterContent getContent(
        @PathVariable("url") String url
    );
}
