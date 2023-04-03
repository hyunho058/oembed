package com.example.oembed.controller;

import com.example.oembed.dto.ContentDto;
import com.example.oembed.dto.ContentView;
import com.example.oembed.service.OembedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class OembedController {
    private final OembedService oembedService;

    @GetMapping("/")
    public String root() {
        return "oembed";
    }

    @GetMapping("/contents")
    public String getContents(Model model,
                              @RequestParam("url") String url) {
        ContentView contents = oembedService.getContents(ContentDto.of(url));
        model.addAttribute("contents", contents);
        return "oembed";
    }
}
