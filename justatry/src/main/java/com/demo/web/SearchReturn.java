package com.demo.web;


import java.util.ArrayList;

/**
 * Created by 老虎 on 2017/5/30.
 * 返回的封装类 要根据实际业务返回
 */
public class SearchReturn {

    private Long total;

    private ArrayList<String> HighLighting;

    private ArrayList<String> searchText;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ArrayList<String> getHighLighting() {
        return HighLighting;
    }

    public void setHighLighting(ArrayList<String> highLighting) {
        HighLighting = highLighting;
    }

    public ArrayList<String> getSearchText() {
        return searchText;
    }

    public void setSearchText(ArrayList<String> searchText) {
        this.searchText = searchText;
    }
}
