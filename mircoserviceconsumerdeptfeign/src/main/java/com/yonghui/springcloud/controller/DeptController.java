package com.yonghui.springcloud.controller;

import com.yonghui.springcloud.entity.Dept;
import com.yonghui.springcloud.service.DeptServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author djl
 * @date 2019/8/7 15:26
 */
@RestController
public class DeptController {

    @Autowired
    private DeptServiceClient deptServiceClient;

    @RequestMapping(value = "/customer/dept/add")
    public Boolean add(@RequestBody Dept dept){
        return deptServiceClient.add(dept);
    }

    @RequestMapping(value = "customer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptServiceClient.get(id);
    }

    @RequestMapping(value = "customer/dept/list")
    public List<Dept> list()
    {
        return deptServiceClient.list();
    }
}
