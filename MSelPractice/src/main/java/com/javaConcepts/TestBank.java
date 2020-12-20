package com.javaConcepts;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//compile time polymorph or static poly
		HdfcBank hb = new HdfcBank();
		hb.interestOnLoan();
		hb.funds();
		hb.test();
		
		//ddynamic polymorph ya run time
		RBI rb = new HdfcBank();
		rb.interestOnLoan();
		
		//RBI r = new RBI();
		//rb.a=9;
		System.out.println(rb.a);

		rb.test();
	}

}
