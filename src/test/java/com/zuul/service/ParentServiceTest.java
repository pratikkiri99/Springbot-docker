package com.zuul.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyInt;
@RunWith(MockitoJUnitRunner.class)
public class ParentServiceTest {

	@InjectMocks
	ParentService parent;
	
	@Mock
	ChildService child;
	
	
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}
