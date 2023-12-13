package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dtTest")
public class dataTableTest {
    @RequestMapping("/servSideTest")
    public List<Map<String,Object>> dtTest(){
        List<Map<String, Object>> data = new ArrayList<>();

        return data;
    }
}



