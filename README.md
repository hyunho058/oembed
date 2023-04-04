# oembed
> oEmbed를 활용하여 youtube, twitter, vimeo등의 컨텐츠를 미리보여주는 서비스 입니다.

1. 서비스 구현 기술
2. 서비스 사용방법
3. 서비스 동작 이미지
4. 인스타그램 사용할 수 없는 이유

## 서비스 구현 기술
* java 11
* Spring Boot 2.7.11
* feign client
* junit
* thymeleaf


## 서비스 사용방법
1. 프로젝트 RUN(application build)
2. 웹 브라우저 주소창에 http://localhost:8080
3. 검색창에 보고싶은 콘텐츠(youtube, twitter, vimeo) URL주소를 입력 하여 검색합니다.
4. 잘못된 형식의 요청이나 오류 발생시 오류 페이지가 표시 되며 다시 검색하기를 통해 검색창으로 이동 할 수 있습니다.

## 서비스 동작 이미지
* youtube

    ![embed_youtube_230404](https://user-images.githubusercontent.com/58923731/229782616-c9a38060-f5c0-441b-b82e-7db7f8b5a3f2.png)

* twitter

    ![oembed_twitter_230404](https://user-images.githubusercontent.com/58923731/229782725-1e2fc189-bf27-4e1b-a515-e6cc15181c65.png)
 
* vimeo

  ![oembed_vimeo_230404](https://user-images.githubusercontent.com/58923731/229782809-84801832-84c2-41d5-a885-7ceea591e607.png)
 
* 오류페이지

  ![oembed_error_230404](https://user-images.githubusercontent.com/58923731/229782945-0e978f62-65e8-40b5-ab07-816fb3c8b107.png)

## 인스타그램 사용할 수 없는 이유
* facebook 개발자 계정(엑세스 토큰)과 oEmbed 읽기 기능에 대한 앱 검수가 필요 하기 때문에 사용에 제한이 있습니다. 
  * Facebook API를 통해 embed 코드를 생성하고 제공하고 있습니다. 따라서, Instagram을 oEmbed를 통해 검색하는 것은 불가능합니다.
  ![instagram](https://user-images.githubusercontent.com/58923731/229786935-f37e085e-06e1-4cc9-8766-11624a41a699.png)
* [Reference](https://developers.facebook.com/docs/instagram/oembed)