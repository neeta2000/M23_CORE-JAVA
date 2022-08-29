package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ZonedTime {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("America/La_Paz"));
		LocalDateTime dt=LocalDateTime.now(ZoneId.of("Asia/Aden"));
		System.out.println(t);
		System.out.println(dt);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
