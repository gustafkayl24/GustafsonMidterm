package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	//attributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	//no-argument constructor
	public Enrollment(){
	}
	//two-argument constructor
	public Enrollment(UUID StudentID , UUID SectionID){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = UUID.randomUUID();
	}
	//defined as a procedure and return the Grade 
	public double SetGrade(double Grade){
		return Grade;
	}
}
