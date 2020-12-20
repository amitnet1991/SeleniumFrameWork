package com.javaConcepts;

public class ThisConcept {
	
	int age;
	String name;
	
	/*public ThisConcept(int age, String name)
	{
		this.age = age;
		this.name = name;
		
		//System.out.println("My age is " + age + " and my name is " + name  );
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ThisConcept tc = new ThisConcept(10, "Amit");
		ThisConcept tc = new ThisConcept();
		tc.person();

	}
	
	
public void person()
{
	System.out.println("My age is " + age + " and my name is " + name  );
}
	
}
