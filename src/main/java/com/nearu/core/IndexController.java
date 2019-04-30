package com.nearu.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/4/29 10:38
 */
@RestController
public class IndexController {
    @RequestMapping("/s")
    public String s() {
        return "ss";
    }

}
