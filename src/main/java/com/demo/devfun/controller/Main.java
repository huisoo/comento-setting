package com.demo.devfun.controller;

import com.demo.devfun.dao.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Main {

    @Autowired
    private TestDAO testDAO;


    @RequestMapping(value="/ping", produces = "application/json")
    @ResponseBody
    public Object json(){
        Map<String, Object> map = new HashMap<>();
        map.put("today", ZonedDateTime.now());
        return map;
    }

    @RequestMapping(value="/jsonTest", produces = "application/json")
    @ResponseBody
    public Object testMybatis(){

        Integer a = testDAO.getTestCount();

        Map<String, Object> map = new HashMap<>();
        //map.put("test", "Hello world!(/json) This is Spring MVC project by using IntelliJ");
        map.put("count", a);
        map.put("sample", testDAO.getSample());

        return map;
    }


}