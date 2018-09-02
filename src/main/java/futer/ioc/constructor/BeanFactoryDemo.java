package futer.ioc.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		//beanFactory.registerBeanDefinition(Myconstructor.class.getSimpleName(), beanDefinition);
		
//		BeanFactory factory = bindViaPropertiesFile(beanFactory);
//		Myconstructor myconstructor = (Myconstructor) factory.getBean("Myconstructor");
//				System.err.println(myconstructor.toString());
//				
//				System.out.println(myconstructor.getMyconstructor1());
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		Myconstructor myconstructor = applicationContext.getBean(Myconstructor.class);
		
		Myconstructor myconstructor1 = applicationContext.getBean(Myconstructor.class);
		
		System.out.println(myconstructor.getBeanMyconstructor1());
		System.out.println(myconstructor1.getBeanMyconstructor1());
		//applicationContext.get

	}
	
	
	/**
	 * 直接编码的方式
	 * @param beanDefinitionRegistry
	 * @return
	 */
	public static BeanFactory bindBean(BeanDefinitionRegistry beanDefinitionRegistry) {
		AbstractBeanDefinition beanDefinition = new RootBeanDefinition(Myconstructor.class);
		beanDefinitionRegistry.registerBeanDefinition("Myconstructor", beanDefinition);
		//new ChildBeanDefinition(original)
		AbstractBeanDefinition beanDefinition1 = new RootBeanDefinition(Myconstructor1.class);
		// 注入其他依赖
		ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
		argumentValues.addIndexedArgumentValue(0, beanDefinition1);
		
		beanDefinition.setConstructorArgumentValues(argumentValues);
		return (BeanFactory) beanDefinitionRegistry;
	}
	
	/**
	 * 通过加载外部配置文件的方式
	 * @param beanDefinitionRegistry
	 * @return
	 */
	public static BeanFactory bindViaPropertiesFile (BeanDefinitionRegistry beanDefinitionRegistry) {
		PropertiesBeanDefinitionReader propertiesBeanDefinitionReader = new PropertiesBeanDefinitionReader(beanDefinitionRegistry);
		propertiesBeanDefinitionReader.loadBeanDefinitions("classpath:bindbean.properties");
	
		
		
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
