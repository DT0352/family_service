package com.mashibing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhiDong
 * <p>
 * 2021/1/9
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        System.out.println("123");
        return "123";
    }
}
