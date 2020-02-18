package com.zuul.service;

import org.springframework.stereotype.Service;

@Service
public class ChildService {

	public int getValue(int v) {
		System.out.println("value child reeivd "+v);
		v = v  * 3;
		return v;
	}
	
}
