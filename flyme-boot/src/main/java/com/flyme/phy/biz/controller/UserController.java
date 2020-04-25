/*
package com.flyme.phy.biz.controller;

import com.flyme.phy.base.controller.BaseController;
import com.flyme.phy.base.mapper.BaseMapper;
import com.flyme.phy.biz.bean.User;
import com.flyme.phy.biz.service.UserServiceImpl;
import com.flyme.phy.biz.service.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

*/
/**
 * @author ：mmzs
 * @date ：Created in 2020/4/18 16:43
 * @description：
 * @modified By：
 * @version: $
 *//*

@RestController(UserController.BEAN_NAME)
//@Slf4j
@RequestMapping("/user")
public class UserController extends BaseController {
    static final String BEAN_NAME ="com.flyme.phy.biz.controller.UserController";
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/dirUser")
    public List<User> dirUser(){
        return userService.dirUser();
    }
}
*/
