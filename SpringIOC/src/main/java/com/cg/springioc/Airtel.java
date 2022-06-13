package com.cg.springioc;

public class Airtel implements Sim
{	
	public Airtel() {
		System.out.println("condtuctor");
	}
	public void calling () {
		System.out.println("calling using Airtel");
	}
	public void data()
	{
		System.out.println("Browsing using Airtel");
	}
	
}



