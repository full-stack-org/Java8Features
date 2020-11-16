package com.java8.date.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class CurrentDate {

	public static void main(String[] args) {
		System.out.println(LocalDate.now() + " : " + LocalTime.now() + " : " + LocalDateTime.now());
		System.out.println(LocalDate.now().getDayOfMonth() + " : " + LocalTime.now().getMinute() + " : "
				+ LocalDateTime.now().getYear());

		String date = "2020-11-11";
		System.out.println("Minus Days : " + LocalDate.parse(date).minusDays(10));
		System.out.println("Plus Days : " + LocalDate.parse(date).plusDays(10));
		System.out.println("Minus Months : " + LocalDate.parse(date).minusMonths(10));
		System.out.println("Plus Months : " + LocalDate.parse(date).plusMonths(10));
		System.out.println("Minus Years : " + LocalDate.parse(date).minusYears(10));
		System.out.println("Plus Years : " + LocalDate.parse(date).plusYears(10));

		System.out.println("Is Leaf Year : " + LocalDate.parse(date).isLeapYear());

		LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 12, 0, 0);
		System.out.println(localDateTime);

		LocalDate birthDate = LocalDate.of(1988, 04, 04);
		LocalDate today = LocalDate.now();
		
		System.out.println("Bith Date : " + Period.between(birthDate, today).getMonths());
		
		System.out.println("Current Zone : "+ ZoneId.systemDefault());
		System.out.println("Available Zones : "+ ZoneId.getAvailableZoneIds().spliterator().characteristics());

		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");

		LocalTime time1 = LocalTime.now(zone1);
		System.out.println("India Time Zone: " + time1);

		LocalTime time2 = LocalTime.now(zone2);
		System.out.println("Japan Time Zone: " + time2);

		long hours = ChronoUnit.HOURS.between(time1, time2);

		System.out.println("Hours between two Time Zone: " + hours);

		long minutes = ChronoUnit.MINUTES.between(time1, time2);

		System.out.println("Minutes between two time zone: " + minutes);
	}

}
