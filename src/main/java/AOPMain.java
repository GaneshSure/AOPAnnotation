import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.spring.aop.model.Demo;

public class AOPMain {
	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext("AppConfig.class");
		Object o=ctx.getBean("demoImpl");
		Demo d=(Demo)o;
		
		try {
			d.businessMethod1(1000);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("======================");
		d.businessMethod2();
		System.out.println("==========");
		try {
			d.businessMethod1(-1000);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
