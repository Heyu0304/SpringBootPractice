package com.treenewbee.controller;

import com.treenewbee.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A on 2017/6/12.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUserList")
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("zhangchi");
        user1.setPassword("123456");
        User user2 = new User();
        user2.setId(2);
        user2.setUsername("tree");
        user2.setPassword("123456");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
