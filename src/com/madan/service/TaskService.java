package com.madan.service;

import java.util.List;

import com.madan.domain.Ttask;

public interface TaskService {
	public List<Ttask> getAllTasks();
	public Ttask getOneTask(int id);
	public Boolean updateTask (Ttask task);
	public Boolean deleteTask (int id);
	
	
	
	

}
