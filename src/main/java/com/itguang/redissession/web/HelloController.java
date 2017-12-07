package com.itguang.redissession.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author itguang
 * @create 2017-12-07 10:23
 **/

@RestController
public class HelloController {

    @RequestMapping("/hello/{username}")
    public String hello(HttpSession session, @PathVariable(value = "username") String username) {
        session.setAttribute("username", username);
        return "保存session到Redis成功";
    }

    @RequestMapping("/getName")
    public String getUsername(HttpSession session) {
        String username = (String) session.getAttribute("username");
        return username;
    }

}
