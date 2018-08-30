package futer.ioc.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanFactoryDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		//beanFactory.registerBeanDefinition(Myconstructor.class.getSimpleName(), beanDefinition);
		
		BeanFactory factory = bindBean(beanFactory);
		Myconstructor myconstructor = factory.getBean(Myconstructor.class);
				System.err.println(myconstructor.toString());
	}
	
	
	/**
	 * 
	 * @param beanDefinitionRegistry
	 * @return
	 */
	public static BeanFactory bindBean(BeanDefinitionRegistry beanDefinitionRegistry) {
//		beanDefinitionRegistry.
		//beanDefinitionRegistry
		
		//beanDefinitionRegistry.registerBeanDefinition("test", beanDefinition);
		return (BeanFactory) beanDefinitionRegistry;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BeanFactoryDemo []";
	}
}
