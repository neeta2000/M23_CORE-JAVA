package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime2 {

	public static void main(String[] args) {
		LocalDateTime t=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");
		String str=t.format(df);
		System.out.print(str);

	}

}
