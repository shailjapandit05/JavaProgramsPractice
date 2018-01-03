package practiceClasses;

public class StringReverse {

	public static void main(String[] args) {
		String name="";
//		String[] myArr = {"Something", "Else"};
		
		
		
		
		String[] a="My name Shailja".split(" ");
/*	String a = " Shailja is a girl ";
	String b="";
	for(int i=a.length()-1;i>=0;i--){
		b=b+a.charAt(i);
		
	}
	System.out.println(b);*/
	for (String word : a) {
	String temp = "";
	for(int i=word.length()-1;i>=0;i--){
		 temp = temp+word.charAt(i);
	}
		name=name+temp + " ";
	}
	
	
	
	
System.out.println(name);
	
	}
}
