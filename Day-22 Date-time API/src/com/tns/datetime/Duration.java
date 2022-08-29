package com.tns.datetime;
//count number of days between both dates
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Duration {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		//LocalDate date2=date1.plusDays(3);
		//LocalDate date2=date1.minusDays(1);
		LocalDate date2=date1.plusYears(3);
		System.out.println(date2);
		long d=ChronoUnit.DAYS.between(date1,date2);
		System.out.println(d);

	}

}
