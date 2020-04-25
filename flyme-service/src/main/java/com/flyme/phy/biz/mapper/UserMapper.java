package com.flyme.phy.biz.mapper;

import com.flyme.phy.base.mapper.BaseMapper;
import com.flyme.phy.biz.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository(UserMapper.BEAN_NAME)
public interface UserMapper extends BaseMapper<User> {
    String BEAN_NAME = "com.flyme.phy.biz.mapper.UserMapper";
    List<User> queryUserByIf(Map<String,Object> map);
    boolean insertBean(User bean);
    boolean delete(int id);
    boolean update(User bean);
    boolean save(User bean);
}
