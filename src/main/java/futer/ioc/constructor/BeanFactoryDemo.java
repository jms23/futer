package futer.ioc.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class BeanFactoryDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		//beanFactory.registerBeanDefinition(Myconstructor.class.getSimpleName(), beanDefinition);
		
		BeanFactory factory = bindBean(beanFactory);
		Myconstructor myconstructor = (Myconstructor) factory.getBean("Myconstructor");
				System.err.println(myconstructor.toString());
				
				System.out.println(myconstructor.getMyconstructor1());
	}
	
	
	/**
	 * 
	 * @param beanDefinitionRegistry
	 * @return
	 */
	public static BeanFactory bindBean(BeanDefinitionRegistry beanDefinitionRegistry) {
		AbstractBeanDefinition beanDefinition = new RootBeanDefinition(Myconstructor.class);
		beanDefinitionRegistry.registerBeanDefinition("Myconstructor", beanDefinition);
		
		AbstractBeanDefinition beanDefinition1 = new RootBeanDefinition(Myconstructor1.class);
		// 注入其他依赖
		ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
		argumentValues.addIndexedArgumentValue(0, beanDefinition1);
		
		beanDefinition.setConstructorArgumentValues(argumentValues);
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
