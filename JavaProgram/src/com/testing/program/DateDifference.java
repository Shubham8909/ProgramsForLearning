package com.testing.program;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDifference {

	  public static void main(String[] args) {

		String dateStart = "01/14/2012 09:29:58";
		String dateStop = "08/15/2018 10:31:48";

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			/*DateTime dt1 = new DateTime(d1);
			DateTime dt2 = new DateTime(d2);

			System.out.print(Days.daysBetween(dt1, dt2).getDays() + " days, ");
			System.out.print(Hours.hoursBetween(dt1, dt2).getHours() % 24 + " hours, ");
			System.out.print(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60 + " minutes, ");
			System.out.print(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60 + " seconds.");
			*/
			//in milliseconds
		    System.out.println( d2.getTime()+"-------d2");
		    System.out.println( d1.getTime()+"-------d1");
			long diff = d2.getTime() - d1.getTime();
			
			
			
			Calendar sDate = Calendar.getInstance();
			Calendar eDate = Calendar.getInstance();
			sDate.setTime(d2);
			eDate.setTime(d1);
			int difInMonths = sDate.get(Calendar.MONTH) - eDate.get(Calendar.MONTH);
			int difInYear = sDate.get(Calendar.YEAR) - eDate.get(Calendar.YEAR);
			int difInsecond = sDate.get(Calendar.SECOND) - eDate.get(Calendar.SECOND);
			
			
			System.out.println(difInMonths);
			System.out.println(difInYear);
			System.out.println(difInsecond);
			
			
			
			
			
			
			long diffSeconds1 = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000) % 31;
			long diffYears = diff / ( 31* 24 * 60 * 60 * 1000)% 12;

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds1 + " seconds. ");
			System.out.print(diffYears + " year. ");

		 } catch (Exception e) {
			e.printStackTrace();
		 }

	  }

	}
