package practiceClasses;

import java.util.HashMap;
import java.util.Scanner;

public class Fabonacci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,f1,f2=0,f3=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto which u want to have fabonacci series");
		n=sc.nextInt();
		for(i=1;i<n+1;i++){
			System.out.println(f3+" ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		
		
	}
	
	
}
