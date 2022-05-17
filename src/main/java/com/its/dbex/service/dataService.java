package com.its.dbex.service;

import com.its.dbex.repository.dataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dataService {
    @Autowired
    private dataRepository hr;

    public void save(String a,String b){
     hr.save(a,b);
    }
}
