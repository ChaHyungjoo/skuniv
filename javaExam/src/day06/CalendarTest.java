package day06;

import java.util.Calendar;


public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar c = Calendar.getInstance();
//		
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(Calendar.MONTH)+1);
//		System.out.println(c.get(Calendar.DATE));
//		
//		c.set(2015, 6, 7);
//		
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(Calendar.MONTH));
//		System.out.println(c.get(Calendar.DATE));
		
		Calendar calendar = Calendar.getInstance();
		
		printDate(calendar);

	}


public static void printDate(Calendar calendar){
	System.out.println(calendar.get(Calendar.YEAR)+"년"+
						calendar.get(Calendar.MONTH)+"월"+
						calendar.get(Calendar.DATE)+"일"+
						(calendar.get(Calendar.AM_PM)==0?"오전":"오후")+
						calendar.get(Calendar.HOUR)+"시"+
						calendar.get(Calendar.MINUTE)+"분"+
						calendar.get(Calendar.SECOND)+"초");
}
}
