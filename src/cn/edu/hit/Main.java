package cn.edu.hit;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		//example 1 
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate);
		
		//example 2 
//		LocalDate localDate = LocalDate.now();
//		int year = localDate.getYear();
//		int month = localDate.getMonthValue();
//		int day = localDate.getDayOfMonth();
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(day);
		
		//example 3
//		LocalDate localDate = LocalDate.of(2015, 12, 6);
//		System.out.println(localDate);
		
		//example 4
//		LocalDate localDate = LocalDate.now();
//		LocalDate localDate2 = LocalDate.of(2015, 12, 10);
//		System.out.println(localDate.equals(localDate2));
		
		//example 5 检查重复日期
//		LocalDate dateOfBirth = LocalDate.of(2010, 01, 14); 
//		MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth()); 
//		MonthDay currentMonthDay = MonthDay.from(LocalDate.now()); 
//		if(currentMonthDay.equals(birthday)){ 
//		    System.out.println("Many Many happy returns of the day !!"); 
//		}else{ 
//		    System.out.println("Sorry, today is not your birthday"); 
//		}
		
		//example 6 获取当前时间
//		LocalTime localTime = LocalTime.now();
//		System.out.println(localTime);
		
		//example 7 增加时间里面的小时数
//		LocalTime localTime = LocalTime.now();
//		localTime.plusHours(2);
//		System.out.println(localTime.plusHours((2)));
//		System.out.println(localTime);
		
		
		//example 8 获取一周后的日期
//		LocalDate today = LocalDate.now();
//		LocalDate nextWeek = today.plusWeeks(2);
//		LocalDate nextWeek2 = today.plus(2, ChronoUnit.WEEKS);
//		System.out.println(nextWeek);
//		System.out.println(nextWeek2);
		
		//example 9获取一年前的日期
//		LocalDate today = LocalDate.now();
//		LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);
//		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
//		System.out.println(previousYear);
//		System.out.println(nextYear);
		
		//exampl 10 使用时钟
//		Clock clock = Clock.systemUTC(); 
//		System.out.println("Clock : " + clock); 
//		// Returns time based on system clock zone Clock defaultClock = 
//		Clock.systemDefaultZone(); 
//		System.out.println("Clock : " + clock); 
	
		//example 11 判断日期的先后关系
//		LocalDate today = LocalDate.now();
//		LocalDate tomorrow = LocalDate.of(2016, 1, 15); 
//		if(tomorrow.isAfter(today)){ 
//		    System.out.println("Tomorrow comes after today"); 
//		} 
//		LocalDate yesterday = today.minus(1, ChronoUnit.DAYS); 
//		if(yesterday.isBefore(today)){ 
//		    System.out.println("Yesterday is day before today"); 
//		}
		
		
		//example 12 java 8 带日期的时间
//		ZoneId america = ZoneId.of("America/New_York");
//		LocalDateTime localtDateAndTime = LocalDateTime.now(); 
//		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america); 
//		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork); 
//		System.out.println(localtDateAndTime);
//		System.out.println(dateAndTimeInNewYork);
		
		//example 13 YearMonth
//		YearMonth currentYearMonth = YearMonth.now(); 
//		System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth()); 
//		YearMonth creditCardExpiry = YearMonth.of(2018, Month.FEBRUARY); 
//		System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
		
		
		//example 14 判断闰年的新方法 
//		LocalDate localDate = LocalDate.now();
//		LocalDate newDate = localDate.minus(3, ChronoUnit.YEARS);
//		System.out.println(localDate.isLeapYear());
//		System.out.println(newDate.isLeapYear());
		
		//example 15 计算两个日期之间包含多少天 bug to fix 
//		LocalDate localDate = LocalDate.now();
//		LocalDate newDate = LocalDate.of(2016, 2, 8);
//		Period period = Period.between(localDate, newDate);
//		System.out.println(period.getMonths());
//		System.out.println(period.getDays());
		
//		LocalDate today = LocalDate.now();
//		LocalDate java8Release = LocalDate.of(2014, Month.MARCH, 14); 
//		Period periodToNextJavaRelease = 
//		Period.between(today, java8Release); 
//		System.out.println("Months left between today and Java 8 release : " + periodToNextJavaRelease.getMonths() );
		
	    //example 16
//		LocalDateTime datetime = LocalDateTime.of(2014, Month.JANUARY, 14, 19, 30); 
//		ZoneOffset offset = ZoneOffset.of("+05:30"); 
//		OffsetDateTime date = OffsetDateTime.of(datetime, offset); 
//		System.out.println("Date and Time with timezone offset in Java : " + date); 
		
		//example 17 获取时间戳
//		Instant timestamp = Instant.now(); 
//		System.out.println("What is value of this instant " + timestamp); 
		
		//example 18 使用预定义的格式来对日期和时间进行格式化
//		String dayAfterTommorrow = "20140116"; 
//		LocalDate formatted = LocalDate.parse(dayAfterTommorrow, 
//		DateTimeFormatter.BASIC_ISO_DATE); 
//		System.out.printf("Date generated from String %s is %s %n", dayAfterTommorrow, formatted);
		
		//example 19 定义格式解析日期
//		String goodFriday = "Apr 18 2014"; 
//		try { 
//		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");     
//		    LocalDate holiday = LocalDate.parse(goodFriday, formatter); 
//		    System.out.printf("Successfully parsed String %s, date is %s%n", goodFriday, holiday); 
//		} catch (DateTimeParseException ex) { 
//		    System.out.printf("%s is not parsable!%n", goodFriday); 
//		    ex.printStackTrace(); 
//		} 
		
		//example 20 日期格式化为字符串
		LocalDateTime arrivalDate = LocalDateTime.now(); 
		try { 
			DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm a"); 
			String landing = arrivalDate.format(format); 
			System.out.printf("Arriving at : %s %n", landing); 
		} catch (DateTimeException ex) { 
			System.out.printf("%s can't be formatted!%n", arrivalDate); 
			ex.printStackTrace(); 
		} 

		
	}
}
