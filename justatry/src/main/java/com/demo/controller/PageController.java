package com.demo.controller;

import com.demo.dao.TestDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 老虎
 * 此类与velocity模板组合，直接返回静态化页面
 */
@Controller
public class PageController {
    @Resource
    private TestDao dao;

//    @RequestMapping("/page")
//    public String hello(Map<String,Object> model){
//        model.put("data",dao.findAll());
//        return "hello";
//    }此方法为springdatajpa组合返回

    //应用mybatis
    @RequestMapping("/page")
    public String hello(Map<String,Object> model){
        List<Map> list = dao.list();

        model.put("data",list);

        return "hello";
    }

}
