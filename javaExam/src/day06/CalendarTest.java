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
	System.out.println(calendar.get(Calendar.YEAR)+"��"+
						calendar.get(Calendar.MONTH)+"��"+
						calendar.get(Calendar.DATE)+"��"+
						(calendar.get(Calendar.AM_PM)==0?"����":"����")+
						calendar.get(Calendar.HOUR)+"��"+
						calendar.get(Calendar.MINUTE)+"��"+
						calendar.get(Calendar.SECOND)+"��");
}
}
