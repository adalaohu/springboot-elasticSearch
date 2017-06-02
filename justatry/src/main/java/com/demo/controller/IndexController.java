package com.demo.controller;

import com.demo.dao.TestDao;
import com.demo.model.Test;
import com.demo.service.EsService;
import com.demo.web.SearchReturn;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 老虎
 */
@RestController
public class IndexController {
    @RequestMapping("/index")
    public Object test(){
        return "index";
    }
    @RequestMapping("/get")
    public Object get(){
        return "get请求!";
    }
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public Object post(){
        return "post请求!";
    }
    @RequestMapping(value = "/rest/{param}",method = RequestMethod.GET)
    public Object rest(@PathVariable String param){
        return "你输入的参数为 : " + param;
    }

    @Resource
    private TestDao testDao;

    @Resource
    private EsService esService;
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Object add(){
        Test test = new Test();
        test.setId(5);
        test.setName("测试数据");
        test.setContent("测试内容");
//        testDao.save(test);
        testDao.insert(test);
        return test;
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Object list(){;
//        return testDao.findAll();
        return testDao.selectAll();
    }
    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
    public Object del(@PathVariable Integer id){;
//        testDao.delete(id);
        testDao.deleteByPrimaryKey(id);
//        return testDao.findAll();
        return testDao.selectAll();
    }
    //以上注释掉的代码为Springdatajpa


    //初始化数据的方法，将本地mysql的表数据同步到es
    @RequestMapping("/init")
    public List<Map> init(){
        List<Map> init = esService.init();
        return init;
    }

    //输入关键字查询的方法
    @RequestMapping(value = "/search/{param}",method = RequestMethod.GET)
    public SearchReturn search(@PathVariable String param){
        SearchReturn list = esService.scSearch(param);
        return list;
    }

}
