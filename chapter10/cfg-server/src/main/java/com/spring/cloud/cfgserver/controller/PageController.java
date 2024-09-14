package com.spring.cloud.cfgserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**** imports ****/
@Controller
public class PageController {
    // 打开一个Thymeleaf页面
    @GetMapping("/encode")
    public String encode() {
        return "encode";
    }
}