package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeDown();
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean(args[0]);
//		tv.powerOff();
//		tv.volumeUp();
		
		//1. Spring 컨테이너를 구동한다
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 필요한 객체 요청(Lookup)
		TV tv = (TV)factory.getBean("tv");
		tv.powerOff();
		tv.volumeUp();
		
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
		
		// Spring 컨테이너 종료
		factory.close();
	}
}
