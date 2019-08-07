package com.yonghui.springcloud.service.impl;

import com.yonghui.springcloud.dao.DeptDao;
import com.yonghui.springcloud.entity.Dept;
import com.yonghui.springcloud.service.DeptServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptServiceClient
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
