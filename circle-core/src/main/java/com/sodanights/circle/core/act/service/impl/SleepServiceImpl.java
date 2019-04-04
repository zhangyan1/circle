package com.sodanights.circle.core.act.service.impl;

import com.sodanights.circle.core.act.service.SleepService;
import org.springframework.stereotype.Service;

@Service
public class SleepServiceImpl implements SleepService{


    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
