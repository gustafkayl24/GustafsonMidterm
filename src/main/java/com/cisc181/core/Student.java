package com.cisc181.core;
//change student.Major so it uses the eMajor eNum
//import the package of eNums
import com.cisc181.eNums.*;
import java.util.Date;


public class Student extends Person {

//change from string to eMajo
	private eMajor Major;
//change String to eMajor and Major value to eMajor	
	public eMajor getMajor(eMajor Major)
    {
        return this.Major;
    }
//Major value to eMajor
    public void setMajor (eMajor Major)
    {
        this.Major = Major;           
    }
//Change Major String to eMajor 
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}