package com.demo.demoproject;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	
	private static App app;
	
	@BeforeClass
	public static void init()
	{
		app=new App();
	}

	@Test
	public void addTest() 
	{
		assertEquals(30,app.add(10,20));
		
	}
	
	@Test
	public void addTest2() 
	{
		assertEquals(40,app.add(20,20));
		
	}

}
