package com.yonghui.springcloud.service;

import com.yonghui.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author djl
 * @date 2019/8/7 15:15
 */

@FeignClient(value = "microservice-dept")
public interface DeptServiceClient {

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Dept get(Long id);

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> list();
}
