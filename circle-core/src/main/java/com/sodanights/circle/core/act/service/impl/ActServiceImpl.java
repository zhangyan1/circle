package com.sodanights.circle.core.act.service.impl;
import org.springframework.stereotype.Service;
import com.sodanights.circle.core.act.service.ActService;

/**
 * Created by zhangyan on 27/03/2018.
 */
@Service("actService")
public class ActServiceImpl implements ActService {

    @Override
    public void aopHello(String person) {
        System.out.println("hello:" + person);
    }
}
