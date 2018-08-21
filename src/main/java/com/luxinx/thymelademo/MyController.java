package com.luxinx.thymelademo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/controller")
public class MyController {

    @RequestMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView test(){
        ModelAndView model = new ModelAndView("th");
        model.addObject("user","张三");
        model.addObject("sex","男");
        model.addObject("ischecked","A");
        List<String> result = new ArrayList<>();
        result.add("A");
        result.add("B");
        result.add("C");
        result.add("D");
        HashMap<String,String> map = new HashMap<>();
        map.put("A","优秀");
        map.put("B","良好");
        map.put("C","一般");
        model.addObject("map",map);
        model.addObject("list",result);
        return model;
    }
}
