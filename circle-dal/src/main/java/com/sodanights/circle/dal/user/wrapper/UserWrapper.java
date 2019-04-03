package com.sodanights.circle.dal.user.wrapper;

import javax.annotation.Resource;

import com.sodanights.circle.client.user.domain.UserDomain;
import com.sodanights.circle.client.user.query.UserQuery;
import com.sodanights.circle.dal.common.mapper.Mapper;
import com.sodanights.circle.dal.common.wrapper.Wrapper;
import com.sodanights.circle.dal.user.mapper.UserMapper;
import org.springframework.stereotype.Service;


/**
 * Wrapper
 * @ClassName: UserWrapper
 * @author zhangyan
 * @Date 2019-04-03 14:55:23
 */
@Service
public class UserWrapper extends Wrapper<UserDomain,UserQuery> {

    @Resource
    private UserMapper userMapper;

    @Override
    public Mapper<UserDomain, UserQuery> getMapper() {
        return userMapper;
    }
}