package com.madan.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.madan.domain.Ttask;

@Repository
@Transactional
public class TaskDao {
	@Autowired
	private SessionFactory sf;
public List<Ttask> getAllTasks(){
	Query query=sf.getCurrentSession().createQuery("from Ttask t ");
	return query.list();
}
}
