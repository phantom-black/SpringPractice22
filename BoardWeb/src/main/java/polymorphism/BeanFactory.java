package polymorphism;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.contentEquals("samsung")) {
			return new SamsungTV();
		}
		return null;
	}
}
