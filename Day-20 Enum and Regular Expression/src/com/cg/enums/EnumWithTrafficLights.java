package com.cg.enums;

enum TrafficLight
{
	RED(60),YELLOW(30),GREEN(60);
	private final int seconds;
	//constructor
	private TrafficLight(int seconds)
	{
		this.seconds=seconds;
	}
	
	//getter method only because we use constructor to set the values
	public int getSecond() {
		return seconds;
	}
	
}
public class EnumWithTrafficLights {

	public static void main(String[] args) 
	{
		for(TrafficLight i:TrafficLight.values())
		{
			//value() method is used to access all the inside the constants
			System.out.printf("%s: %d seconds\n",i,i.getSecond());
		}
	}

}
