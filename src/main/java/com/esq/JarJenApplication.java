package com.esq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import java.util.Arrays;
/**
 * ϵͳ������
 * @author esqabc
 * @Create 2019-11-11 11:11:11
 * @Website www.esqabc.com
 * @WeChat 110   
 */ 
@SpringBootApplication
public class JarJenApplication{

	public static void main(String[] args) {
		System.out.println("����ʼ����������������");
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		SpringApplication.run(JarJenApplication.class, args);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("���������ɹ�������������");
		System.out.println("����������ʱ��" + (endTime - startTime) + "����");//�����������ʱ��
		System.out.println("һ����ʱ��" + (endTime - startTime)/60 + "��");
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		
	   return args -> {
	       String[] beanNames = ctx.getBeanDefinitionNames();
	       Arrays.sort(beanNames);
	       Arrays.stream(beanNames).forEach(System.out::println);
	   };
	}	
	
}
