package com.cg.oops;
class Pulser
{
	int speed;
	String color;
	//Using this keyword
	/*
	Pulser(int speed,Sting color)
	{
		this.speed=speed;    //if same variable name and method variable then using this keyword
		this.color=color;
	}
	*/
	//parameterized constructor
	Pulser(int s,String c)
	{
		speed=s;
		color=c;
	}
	void accept()
	{
		System.out.println("Speed is:"+speed+"km/hr"+ " color is:"+color);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Pulser p=new Pulser(50,"Yellow");
		p.accept();
	}

}


