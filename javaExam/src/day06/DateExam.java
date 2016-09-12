package day06;

import java.util.*;
import java.text.DateFormat;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Date d = new Date();
//		System.out.println(d);
//		System.out.println(d.getYear());
//		System.out.println(d.getMonth());
//		System.out.println(d.getDay());
//		System.out.println(d.getTime());
		
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());
		
		DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dateFormat1.format(now));
		
		DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dateFormat2.format(now));
		
		DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dateFormat3.format(now));
		
		DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dateFormat4.format(now));
		

	}

}
