package com.enhanced.hibernateTest.dao;

import java.util.List;

import com.enhanced.hibernateTest.model.Teacher;

public class TeacherDAOImpl extends HibernateTestSession implements TeacherDAO {
	
	private HibernateTestSession hibernateTestSession;
	
	public TeacherDAOImpl() {
		hibernateTestSession = new HibernateTestSession();
	}

	@Override
	public void saveTeacher(Teacher teacher) {
		// el metodo persist es igual al save para guardar en la BD mediante Hibernate
		hibernateTestSession.getSession().persist(teacher);
		hibernateTestSession.getSession().getTransaction().commit();
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return hibernateTestSession.getSession().createQuery("from Teacher").list();
	}

	@Override
	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
