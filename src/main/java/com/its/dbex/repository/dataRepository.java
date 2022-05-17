package com.its.dbex.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class dataRepository {
@Autowired
    SqlSessionTemplate sql;

    public void save(String a,String b){
        System.out.println("a : "+a+" b: "+b);
        sql.insert("data.save",a);

    }



}
