package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) {
		List<String>obj1=Arrays.asList(new String[] {"Rina","Tina","Rita","Sima","Smita","Vaishu"});
		//
		obj1.stream().map((i->i.length())).forEach((i)->System.out.print(i+ " "));
		//obj1.stream().map((i->i.length()>4)).forEach((i)->System.out.print(i+ " "));

	}

}
