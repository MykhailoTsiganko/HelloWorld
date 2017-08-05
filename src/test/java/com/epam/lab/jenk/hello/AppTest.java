package com.epam.lab.jenk.hello;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.epam.lab.jenk.hello.listeners.LoggerListener;


class AppTest{
	@Test
	public void test() {
		System.out.println("My test jenkins");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
		Logger.getLogger(AppTest.class).info("my logg for -----------------------------------------");
	}
}