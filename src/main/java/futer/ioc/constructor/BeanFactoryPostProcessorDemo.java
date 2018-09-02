package futer.ioc.constructor;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 应用BeanFactoryPostProcessor
 * BeanFactoryPostProcessor 本意是插手容器的启动阶段，那么容器的BeanFactory和ApplicationContext 本身是属于继承增加的
 * 关系。
 * BeanFactory需要手动装配 看下面例子
 * ApplicationContext 可以通过xml配置 容器能够自动识别
 * @author youjun.guo
 */
public class BeanFactoryPostProcessorDemo {
	public static void main(String[] args) {
		System.out.println("手动装配....");
		@SuppressWarnings("deprecation")
		ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application.xml"));
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource("路径"));
		configurer.postProcessBeanFactory(beanFactory);
		
		
		
		/** xml 配置的容器会自动识别 **/
	}
}
