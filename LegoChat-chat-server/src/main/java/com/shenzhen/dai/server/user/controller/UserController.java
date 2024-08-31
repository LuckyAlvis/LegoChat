package com.shenzhen.dai.server.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户接口
 * @author: daiyifan
 * @create: 2024-08-31 17:39
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
