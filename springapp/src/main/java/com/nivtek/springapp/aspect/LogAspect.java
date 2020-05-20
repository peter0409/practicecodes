package com.nivtek.springapp.aspect;

import java.sql.SQLException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	
	private Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	
	@Before("execution(public * com.nivtek.springapp.dao.*(..))")
	public void logMethod(JoinPoint joinPoint) {
		
		logger.info(joinPoint.toShortString());
		
		
	}
	
	
	@Around("execution(public * com.nivtek.springapp.dao.*(..))")
	public Object logMethod2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		logger.info("Before advice : "+proceedingJoinPoint.toShortString());
		
		//calling target method
		Object returnValue = proceedingJoinPoint.proceed();
		
		logger.info("after advice : "+proceedingJoinPoint.toShortString());
		
		return returnValue;

	}
	
	@AfterThrowing(pointcut = "execution(public * com.nivtek.springapp.dao.*(..))",throwing = "sqlException")
	public void logMethod3(JoinPoint joinPoint,SQLException sqlException) {
		
		logger.info(joinPoint.toShortString());
		
		
	}
	
	
	@AfterReturning(pointcut = "execution(public * com.nivtek.springapp.dao.*(..))",returning = "returnValue")
	public void logMethod1(JoinPoint joinPoint,Object returnValue) {
		
		logger.info(joinPoint.toShortString());
		logger.info(returnValue.toString());
		
		
	}

}
