package com.javaConcepts;

public interface RBI {
	
	int a=10;
	
	public void interestOnLoan();
	
	
	
	 default void test()
	{
		System.out.println("In default");
	}
	 


	
	
}
