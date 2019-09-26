package com.zyzx.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangting
 * @date 2019/9/22-20:28
 */
@RestController
public class HelloContrloller {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("测试git不同文件的提交");

        return "hello man";
    }
}
