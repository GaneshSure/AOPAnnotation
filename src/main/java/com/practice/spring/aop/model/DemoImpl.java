package com.practice.spring.aop.model;

import com.practice.spring.aop.exception.InsufficientAmountException;

public class DemoImpl implements Demo {


	public void businessMethod1(int amount) throws Exception {
		if(amount<=0) {
			try {
				throw new InsufficientAmountException("U have a given Amount as :" + amount+"it is not valid");
			} catch (InsufficientAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Amount is :"+amount+" it is valid");
		}
	}
	public void businessMethod2() {

		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
