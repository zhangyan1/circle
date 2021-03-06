package com.sodanights.circle.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sodanights.circle.client.common.util.EnvUtil;


@Controller
public class StatusController {

    private static final Logger log = LoggerFactory.getLogger(StatusController.class);

    @RequestMapping(value="/checkstatus",method=RequestMethod.GET)
    @ResponseBody
    public String check(HttpServletResponse response) {
        return "success";
    }

    @RequestMapping(value="/env",method=RequestMethod.GET)
    @ResponseBody
    public String env(HttpServletResponse response) {
        return EnvUtil.getCurrentEnv()+"";
    }

}
