package com.madan.controller;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madan.domain.Ttask;
import com.madan.dto.TaskJson;
import com.madan.service.TaskService;
@RestController
public class TaskController {
	@Autowired
	TaskService taskService;
	
    @RequestMapping(value = "/tasks", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<TaskJson> getAllTask() throws ParseException{
		List<TaskJson>tasksJson=new ArrayList<>();
		List<Ttask> tasks = taskService.getAllTasks();
		for(Ttask t: tasks){
			TaskJson taskJson=new TaskJson();
			taskJson.setTask_id(t.getTaskId());
			taskJson.setTask_description(t.getTaskDescription());
			taskJson.setTask_name(t.getTaskName());
			taskJson.setTask_priority(t.getTaskPriority());
			taskJson.setTask_status(t.getTaskStatus());
			tasksJson.add(taskJson);
		;
		}
		return tasksJson;

	}
}

	


