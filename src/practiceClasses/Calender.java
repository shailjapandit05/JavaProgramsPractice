package practiceClasses;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar c=Calendar.getInstance();
SimpleDateFormat s=new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		String s1=s.format(c.getTime());
				System.out.println(s1);
				System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		DateDemo dd=new DateDemo();
		
		
		
	}

}
