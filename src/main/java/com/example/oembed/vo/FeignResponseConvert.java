package com.example.oembed.vo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FeignResponseConvert {
//    public String getResponseBody(Response response) {
//        if (response.body() == null) {
//            return "";
//        }
//
//        try (InputStream responseBodyStream = response.body().asInputStream()) {
//            return IOUtils.toString(responseBodyStream, StandardCharsets.UTF_8.name());
//        } catch (IOException e) {
//            throw new IllegalArgumentException("feign response body converting error", e);
//        }
//    }
//
//    private ContentsResult getResult(String json) {
//        ObjectMapper objectMapper =
//            new ObjectMapper()
//                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
//        ContentsResult result = null;
//        try {
//            result = objectMapper.readValue(json, ContentsResult.class);
//        } catch (JsonProcessingException e) {
//            log.error("error to parsing", e);
//        }
//        return result;
//    }
//
//    public<T> T fromJson(Response response, Class<T> classOfT) {
//        return new Gson().fromJson(
//            getResponseBody(response),
//            classOfT);
//    }
}
