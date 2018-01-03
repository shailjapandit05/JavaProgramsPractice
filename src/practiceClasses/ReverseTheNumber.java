package practiceClasses;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int remainder;
		int result=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		num =in.nextInt();
		while(num>0)
		{
		remainder=num%10;
		result=result*10+remainder;
		num=num/10;	
		}	
		System.out.println(result);
	
	}

}
