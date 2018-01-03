package practiceClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
System.out.println(d.toString());
SimpleDateFormat s=new SimpleDateFormat("MM/dd/yyyy");
String a=s.format(d);
System.out.println(a);
	}

}
