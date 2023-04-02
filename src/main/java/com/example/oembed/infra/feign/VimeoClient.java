package com.example.oembed.infra.feign;

import com.example.oembed.vo.VimeoContent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "vimeo", url = "https://vimeo.com/api/oembed.json")
public interface VimeoClient {
    @GetMapping("?url={url}")
    VimeoContent getContent(
        @PathVariable("url") String url
    );
}
