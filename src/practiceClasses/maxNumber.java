package practiceClasses;

import java.util.Scanner;

/**
 * @author shapandit
 *
 */
public class maxNumber {

	public static void main(String[] args){

		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		if(a >b && a>c){
			System.out.println(a+"is greater");
		}
		if(b>a && b>c){
			System.out.println(b+"is greater");
		}
		if (c>a && c>b){
			System.out.println(c+"is greater");
		}
	}

}



