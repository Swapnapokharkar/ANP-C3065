package org.hitech.dao;
import org.hitech.model.Student;
import org.hitech.model.Course;
import java.util.*;
import org.hitech.service.*;
import org.hitech.view.*;
import java.util.HashMap;

public class Student_Course_DAO {

	HashMap<Student,Course> map=new HashMap<Student,Course>();
	public void addStudentCourseDetails(Student stud1,Course course1) {
		map.put(stud1,course1);
	}
	public HashMap<Student, Course>getStudentCourseDetails(){
		return map;
	}
	public void deleteStudentCourseDetails(Student stud1) {
		map.remove(stud1);
	}
	 
}
    	

    	 
      
