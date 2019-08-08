package kr.ac.skuniv.springmvctodo.dao;

import java.util.List;

import kr.ac.skuniv.springmvctodo.dto.Todo;
import kr.ac.skuniv.springmvctodo.mapper.Mapper;

@Mapper
public interface TodoMapper {
	
	public Todo getTodo(int id);
	public List<Todo> getTodos();
	public int addTodo(String todo);
	public boolean deleteTodo(int id);
	

}
