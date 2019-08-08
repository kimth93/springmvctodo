package kr.ac.skuniv.springmvctodo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.ac.skuniv.springmvctodo.config.ApplicationConfig;
import kr.ac.skuniv.springmvctodo.dao.TodoMapper;


public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		TodoMapper tododao = context.getBean(TodoMapper.class);
		System.out.println(tododao.getTodos().size());
		System.out.println(tododao.getTodo(1251));
		//tododao.addTodo("spring study");
		
	}

}
