package com.zuul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService {

	@Autowired
	ChildService childService;
	
	public int proces(int num) {

		int returnval = childService.getValue(num);
		return returnval;
	}
	
}
