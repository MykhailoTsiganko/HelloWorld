package com.epam.lab.jenk.hello.listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LoggerListener implements ITestListener{
	public static Logger logger = Logger.getLogger(LoggerListener.class);

	@Override
	public void onTestStart(ITestResult result) {
		logger.info(String.format("Method[%-30s], Starts in : %d", result.getMethod().getMethodName()));

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(result.getTestClass().toString().toUpperCase());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.warn(result.getName().toString().toUpperCase() + "FAILURE");
		logger.warn(result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info(result.toString());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		logger.info(result.toString());
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
