package com.demo.model;


import java.io.Serializable;

/**
 * Created by 老虎
 */
//@Table(name = "test")
//@Entity
public class Test implements Serializable{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
