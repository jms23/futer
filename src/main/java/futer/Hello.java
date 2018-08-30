package futer;

import java.util.LinkedHashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import futer.ioc.constructor.Myconstructor;

/***
 * 学习springIoc
 * @author Administrator
 *
 */
public class Hello {

	public static void main(String[] args) {
		/**
		 * spirng 默认加载的类是 org.springframework.beans.factory.xml.XmlBeanDefinitionReader
		 * 方法： loadBeanDefinitions
		 * 
		 * 先看看这个类是做什么用的？
		 * 首先这类位于 support 包里，应该属于第三方支持的工具 org.springframework.context.support
		 * 1、ClassPathXmlApplicationContext 首先会初始化一个资源解析类 resource, 当做当前环境的上下文资源解析器
		 * 2、可想而知，当前环境是在某台机器上，那么spring必定路径和定义在当前环境的一些属性进行加载(比如定义在proterties里面的系统配置文件，存储在内置的一个map容器中以备后续使用)
		 * 3、解析当前传入ClassPathXmlApplicationContext 里面的配置文件中的占位符  $ 代表的字符
		 * 4、执行一次刷新的方法 onrefsh(), 加了一个线程同步的锁 new Object();
		 * 5、刷新方法里用了一个数据源来存储发布事件： this.earlyApplicationEvents = new LinkedHashSet<>(); 
		 * 6、
		 * 
		 */
		System.out.println("9999999999");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		
		applicationContext.getEnvironment();
		
		/**
		 * 通过postProcess处理器改变了对象的属性
		 */
		MyJavaBean bean = (MyJavaBean) applicationContext.getBean("myJavaBean");
		
		System.out.println(bean.getRemark());
		
		Myconstructor myconstructor = (Myconstructor) applicationContext.getBean("Myconstructor");
		System.out.println(myconstructor.getMyconstructor1());
		
	}

}
