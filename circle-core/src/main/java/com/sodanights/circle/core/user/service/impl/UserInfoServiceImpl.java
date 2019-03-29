package com.sodanights.circle.core.user.service.impl;
import org.springframework.stereotype.Service;
import com.sodanights.circle.core.user.service.UserInfoService;

/**
 * Created by zhangyan on 27/03/2018.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Override
    public void aopHello(String person) {
        System.out.println("hello:" + person);
    }
}
