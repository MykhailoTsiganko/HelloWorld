package com.epam.lab.jenk.hello;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


class AppTest{
	@Test
	public void test() {
		System.out.println("My test jenkins");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
	}
}