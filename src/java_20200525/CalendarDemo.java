package java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		
		cal.setTimeInMillis(1589168098000l);
		
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //월은 희한하게 0부터 센다!!
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		System.out.printf("%d-%d-%d %d:%d%n",year,month,day,hour,minute);
		
		
		//SimpleDataFormat;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		
		String date = sdf.format(cal.getTime());
		System.out.println(date);
		
		
		
	}

}
