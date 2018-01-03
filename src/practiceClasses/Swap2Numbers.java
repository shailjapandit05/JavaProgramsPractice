package practiceClasses;

import java.util.Scanner;

/**
 * @author shapandit
 *
 */
public class Swap2Numbers {

	public static void main(String[] args){

		int num1,num2,num3 = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		num1=sc.nextInt();

		System.out.println("enter num2");
		num2=sc.nextInt();
		System.out.println("reversing the number");
		/*num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;*/
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println(num1);
		System.out.println(num2);
	}
}