package practiceClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date d=new Date();
	
		SimpleDateFormat sf=new SimpleDateFormat("MM/dd/YYYY mm:ssss:hh");
		String m=sf.format(d);
		System.out.println(m);

	}

}
