package com.city.xingwu.service.test.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.city.xingwu.dao.TestDao;
import com.city.xingwu.service.test.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Resource
	private TestDao testDao;
	
	@Override
	public String getCurrentTime() {
		return testDao.getCurrentTime();
	}

}
