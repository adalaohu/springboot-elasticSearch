package com.demo.dao;

import com.demo.model.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import util.MyMapper;

import java.util.List;
import java.util.Map;
//import org.springframework.data.repository.CrudRepository;

    @Mapper
    public interface TestDao extends MyMapper<Test> {
    @Select("select * from test")
    public List<Map> list();

    }
