package com.madan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.madan.dao.TaskDao;
import com.madan.domain.Ttask;
import com.madan.service.TaskService;
@Service
@Transactional
public class TaskServiceImpl  implements TaskService{
	@Autowired
	TaskDao taskDao;

	@Override
	public Boolean deleteTask(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ttask> getAllTasks() {
		// TODO Auto-generated method stub
		List<Ttask>tasks=taskDao.getAllTasks();
		return tasks;
		
	}

	@Override
	public Ttask getOneTask(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateTask(Ttask task) {
		// TODO Auto-generated method stub
		return null;
	}

}
