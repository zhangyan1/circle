package com.sodanights.circle.core.user.service.impl;

import com.sodanights.circle.client.common.result.Result;
import com.sodanights.circle.client.user.domain.UserDomain;
import com.sodanights.circle.client.user.query.UserQuery;
import com.sodanights.circle.core.user.service.UserService;
import com.sodanights.circle.dal.user.wrapper.UserWrapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserWrapper userWrapper;


    public Result<UserDomain> getUserDomain(UserQuery query){
        return userWrapper.get(query);
    }

}
