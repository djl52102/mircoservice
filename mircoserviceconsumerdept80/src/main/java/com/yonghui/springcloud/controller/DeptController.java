package com.yonghui.springcloud.controller;

import com.yonghui.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author djl
 * @date 2019/8/6 11:24
 */

@RestController
public class DeptController {

    private static final String REST_URL_PRFIX="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/customer/dept/add")
    public Boolean add(@RequestBody Dept dept){
       return restTemplate.postForObject(REST_URL_PRFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "customer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PRFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "customer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(REST_URL_PRFIX+"/dept/list",List.class);
    }
}
