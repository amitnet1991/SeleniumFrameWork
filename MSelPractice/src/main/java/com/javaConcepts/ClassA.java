package com.javaConcepts;

public class ClassA extends ClassB implements RBI{
	
	public void test3()
	{
		System.out.println("In class a");
	}

	@Override
	public void interestOnLoan() {
		System.out.println("In class A--method from interface");
		
	}

}
