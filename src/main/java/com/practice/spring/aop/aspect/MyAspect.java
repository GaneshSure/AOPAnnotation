package com.practice.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect {
	
	@After("execution(* com.practice.spring.aop.model.Demo.businessMethod1(..))")
	public void after(JoinPoint jp) {
	
		String str = jp.getSignature().getName();
		System.out.println("I am after advice to :" +str);
	}
	
	@Around("execution(* com..practice.spring.aop.model.Demo.businessMethod2(..)) ")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		
		Object o=null;
		try {
			long x= System.currentTimeMillis();
			o=pjp.proceed();
			long y= System.currentTimeMillis();
			long z=y-x;
			
			String str= pjp.getSignature().getName();
			System.out.println(" I am around advice to :"+ str);
			System.out.println("Time taken to run business is : " +z+"milliseconds");
		}catch (Exception e) {
			// TODO: handle exception
		}
		return o;
	}
}
