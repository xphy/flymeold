package com.flyme.phy.biz.service;

import com.flyme.phy.biz.bean.User;
import com.flyme.phy.biz.mapper.UserMapper;
import com.flyme.phy.biz.service.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Slf4j
@Service(UserServiceImpl.BEAN_NAME)
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> dirUser() {
        return userMapper.selectAll();
    }

    public List<User> queryUserByIf(Map<String, Object> map) {
        return userMapper.queryUserByIf(map);
    }
}
