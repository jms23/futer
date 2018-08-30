package futer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered{

	/**
	 * 
	 */
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		
		MyJavaBean object = (MyJavaBean) beanFactory.getBean("myJavaBean");
		/*object.setDesc("nima");
		object.setRemark("hello");*/
		
		
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
}
