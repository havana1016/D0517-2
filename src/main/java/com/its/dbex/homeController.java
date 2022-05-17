package com.its.dbex;

import com.its.dbex.service.dataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {




    @GetMapping("/")
    String index(){
        return("index");
    }


}
