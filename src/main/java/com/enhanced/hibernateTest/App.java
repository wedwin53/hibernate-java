package com.enhanced.hibernateTest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.enhanced.hibernateTest.dao.TeacherDAOImpl;
import com.enhanced.hibernateTest.model.Course;
import com.enhanced.hibernateTest.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Teacher teacher = new Teacher("Sahid Rebolledo", "Avatar URL Luci");
        TeacherDAOImpl teacherDAOImpl = new TeacherDAOImpl();
        teacherDAOImpl.saveTeacher(teacher);
        
        List<Teacher> teachers = teacherDAOImpl.findAllTeachers();
        
        for (Teacher t : teachers) {
			System.out.println("Nombre del Teacher es: "+ t.getName());
		}
        
        
        
    }
}
