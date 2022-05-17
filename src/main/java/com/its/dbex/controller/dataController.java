package com.its.dbex.controller;

import com.its.dbex.service.dataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class dataController {
    @Autowired
    private dataService hs;



    @GetMapping("/save-form")
    String saveform(){
        return ("save-form");
    }
    @PostMapping("/save")
    void save(@RequestParam("val1")String val1, @RequestParam("val2")String val2){
        hs.save(val1,val2);
    }
}
