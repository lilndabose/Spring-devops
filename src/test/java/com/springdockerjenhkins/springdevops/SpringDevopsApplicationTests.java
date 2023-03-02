package com.springdockerjenhkins.springdevops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringDevopsApplicationTests {

	@Test
	void contextLoads() {
		//given
		int x = 5;
		int y = 7;

		//then
		int expected =  Calculator.add(x,y);

		assertEquals(12,expected);
	}

}

class Calculator{
	public static int add(int x,int y){
		var sum = x+y;
		return sum;
	}
}
