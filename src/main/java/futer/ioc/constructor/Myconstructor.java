package futer.ioc.constructor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/**
 * 演示被关联的bean要通过指定的方式获取实例 （单列 多实例）
 * @author jamesking
 *
 */
public class Myconstructor implements  BeanNameAware {//BeanFactoryAware{
	
	private BeanFactory beanFactory;
	
	public Myconstructor1 myconstructor1;
	
	
	
	@Override
	public String toString() {
		return super.toString();
	}


//	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//		// TODO Auto-generated method stub
//		this.beanFactory = beanFactory;
//		
//	}
	
	public Myconstructor1 getBeanMyconstructor1() {
		return myconstructor1 = beanFactory.getBean(Myconstructor1.class);
	}


public void setBeanName(String name) {
	// TODO Auto-generated method stub
	
}
	
	
}
