package com.flyme.phy.biz.service.impl;

import com.flyme.phy.biz.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    String BEAN_NAME = "com.flyme.phy.biz.service.impl.UserService";

    List<User> dirUser();
    List<User> queryUserByIf(Map<String,Object> map);

}
