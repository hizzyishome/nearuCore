package com.nearu.core.api;

import com.nearu.core.model.UserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/4/30 10:02
 */
@Controller
public class UserController {
    @RequestMapping("/api/user_info")
    public ResponseEntity<UserInfo> getUserInfo() {
        User user = (User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        String email = user.getUsername() + "@beautiful.com";
        UserInfo userInfo = new UserInfo();
        userInfo.setName(user.getUsername());
        userInfo.setEmail(email);
        return ResponseEntity.ok(userInfo);
    }
}
