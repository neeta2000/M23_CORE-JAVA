package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		String datetime="2022-08-28 9:45";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");
		LocalDateTime dt=LocalDateTime.parse(datetime,df);
		System.out.print(dt);

	}

}
