package futer;

import java.util.LinkedHashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import futer.ioc.constructor.Myconstructor;

/***
 * ѧϰspringIoc
 * @author Administrator
 *
 */
public class Hello {

	public static void main(String[] args) {
		/**
		 * spirng Ĭ�ϼ��ص����� org.springframework.beans.factory.xml.XmlBeanDefinitionReader
		 * ������ loadBeanDefinitions
		 * 
		 * �ȿ������������ʲô�õģ�
		 * ��������λ�� support ���Ӧ�����ڵ�����֧�ֵĹ��� org.springframework.context.support
		 * 1��ClassPathXmlApplicationContext ���Ȼ��ʼ��һ����Դ������ resource, ������ǰ��������������Դ������
		 * 2�������֪����ǰ��������ĳ̨�����ϣ���ôspring�ض�·���Ͷ����ڵ�ǰ������һЩ���Խ��м���(���綨����proterties�����ϵͳ�����ļ����洢�����õ�һ��map�������Ա�����ʹ��)
		 * 3��������ǰ����ClassPathXmlApplicationContext ����������ļ��е�ռλ��  $ ������ַ�
		 * 4��ִ��һ��ˢ�µķ��� onrefsh(), ����һ���߳�ͬ������ new Object();
		 * 5��ˢ�·���������һ������Դ���洢�����¼��� this.earlyApplicationEvents = new LinkedHashSet<>(); 
		 * 6��
		 * 
		 */
		System.out.println("9999999999");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		
		System.out.println(applicationContext.getEnvironment());
		
		/**
		 * ͨ��postProcess�������ı��˶��������
		 */
		MyJavaBean bean = (MyJavaBean) applicationContext.getBean("myJavaBean");
		
		System.out.println(bean.getRemark());
		
		Myconstructor myconstructor = (Myconstructor) applicationContext.getBean("Myconstructor");
		System.out.println(myconstructor.getMyconstructor1());
		
	}

}
