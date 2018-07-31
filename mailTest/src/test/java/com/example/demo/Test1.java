package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
	
	@Test
	public void test1() {
		String a="ihdeoi";
		Assert.isNull(a, "a must be null");
	}

}
