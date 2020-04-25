package com.flyme.phy.biz.controller;

import com.flyme.phy.base.controller.BaseController;
import com.flyme.phy.biz.bean.User;
import com.flyme.phy.biz.service.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/18 16:43
 * @description：
 * @modified By：
 * @version: $
 */


@RestController(UserController.BEAN_NAME)
@Slf4j
@RequestMapping("/user")
public class UserController extends BaseController {
    static final String BEAN_NAME ="com.flyme.phy.biz.controller.UserController";
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @RequestMapping("/dirUser")
    @GetMapping("/dirUser")
    public List<User> dirUser(){
        return userService.dirUser();
    }
    @RequestMapping("/aaa")
    public List<User> queryUser(@RequestParam("user") User user,
                                @RequestParam("pageSize") int pageSize,
                                @RequestParam("page") int page){
//        return userService.queryUserByIf(user);
        return null;
    }
}


