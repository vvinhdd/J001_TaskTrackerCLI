package Test;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	
	public static int sum100() {
		int sum = 0;
		for(int i =0; i<=100;i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void doSum100(int count) {
		for(int i=0; i<=count; i++) {
			sum100();
		}
	}
	
	public static void main(String[] args) {
		
		long millis1 = System.currentTimeMillis();
		doSum100(10000);
		long millis2 = System.currentTimeMillis();
		long distance = millis2 - millis1;
		System.out.println("Distance time in milli second: " + distance);
		
		// Time Unit
		System.out.println("3000 năm là bao nhiêu giây: " + TimeUnit.DAYS.toSeconds(3000*365)+"s");
		
		// Date
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date.getDate() + "/" + (date.getMonth()+1) + "/" + (date.getYear()+1900));
		
		// Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		c.add( Calendar.HOUR, 30);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		c.add( Calendar.DATE, 30);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		// DateFormat
		//DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//DateFormat df = new SimpleDateFormat();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		System.out.println(df.format(date));
		
		
	}

}
