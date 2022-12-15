package org.hitech.model;

import java.util.Objects;

public class Student {
	private int studentId;
	private String studentName;
	private String Qualification;
	
	
	public Student(){
		
	}
	public Student(int id,String name,String Qualification  ){
		super();
		this.studentId =id;
		this.studentName = name;
		this.Qualification=Qualification;	
	}
	
	public void setId(int studentId) {
	        this.studentId = studentId;
	    }
    public void setName(String studentName) {
        this.studentName = studentName;
    }
    
    public void setqualification(String qualification) {
        this.Qualification = Qualification;
    }
    
    public int getId() {
   	 return studentId;  
   }
 
    public String getName() {
    	 return studentName;
    }
    
  
    public String getqualification() {
        return Qualification;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Qualification=" + Qualification + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)    
		return false;
        if(getClass()!=obj.getClass()) 
        	return false;
		Student other=(Student)obj;
		return studentId==other.studentId
				&& Objects.equals(studentName, other.studentName)
				&& Objects.equals(Qualification, other.Qualification);
				
   
    }
    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName,Qualification);
    }
	public void addStudentCourseDetails(String string) {
		// TODO Auto-generated method stub
		
	}
}




 
	
    
