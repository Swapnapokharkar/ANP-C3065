package org.hitech.model;

import java.util.Objects;

public class Course {
    private int courseId;
    private String courseName;
    private double price;
	
  public Course(){
		
	}
	
	public Course(int id,String name ,double price){
		super();
		this.courseId =id;
		this.courseName = name;
	    this.price=price;	
	}
	
	 public void setId(int studentId) {
	        this.courseId = studentId;
	    }
    public void setName(String studentName) {
        this.courseName = studentName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    public int getId() {
   	 return courseId;  
   }
 
    public String getName() {
    	 return courseName;
    }
    
    public double getPrice() {
   	 return price;
   }
    
    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName +", price=" + price + "]";
    }
    
   
    public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.courseName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	
    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName,price);
    }
 }
  
    

