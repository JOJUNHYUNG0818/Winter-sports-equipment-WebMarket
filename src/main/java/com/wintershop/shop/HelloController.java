package com.wintershop.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/main")
    public String home() {
        return "index"; // HTML 디렉토리에 있는 index.html 파일을 가리킵니다.
    }
}

