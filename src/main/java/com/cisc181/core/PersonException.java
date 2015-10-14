package com.cisc181.core;
import java.util.Date;


public class PersonException extends Exception{
	private String Person;
public PersonException(String phone_number)
{
	List phoneNumbers = new ArrayList();
	phoneNumbers.add("1234567890");
	phoneNumbers.add("123-456-7890");
	phoneNumbers.add("123.456.7890");
	phoneNumbers.add("123 456 7890");
	phoneNumbers.add("(123) 456 7890");
	 
	//Invalid phone numbers
	phoneNumbers.add("12345678");
	phoneNumbers.add("12-12-111");
	 
	String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	 
	Pattern pattern = Pattern.compile(regex);
	 
	for(String email : phoneNumbers)
	{
	    Matcher matcher = pattern.matcher(email);
	    System.out.println(email +" : "+ matcher.matches());
	}
public PersonException(Date DOB){
	if DOB >= 100;
		return False
}
}
