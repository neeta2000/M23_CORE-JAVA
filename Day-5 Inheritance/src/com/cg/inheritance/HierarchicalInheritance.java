package com.cg.inheritance;

class Student
{
	void display()
	{
		System.out.println("Student Data");
	}
}

class Exam extends Student
{
	void percent()
	{
		System.out.println("Student Exam Performance");
	}
}
class Sport extends Student
{
	void score()
	{
		System.out.println("Student Sport Score");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Sport s=new Sport();
		Exam e=new Exam();
		s.display();
		e.percent();
		s.score();

	}

}
