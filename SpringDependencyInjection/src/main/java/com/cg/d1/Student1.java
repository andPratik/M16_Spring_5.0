package com.cg.d1;

public class Student1 {
MathCheat m;
	
//dependency in terms of objects

	public void setM(MathCheat m) {
		this.m = m;
	}



	public void cheating()
	{
		m.mathcheat();
	}

}
