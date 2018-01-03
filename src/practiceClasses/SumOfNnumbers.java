package practiceClasses;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		System.out.println("enter the number for which the sum is needed");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n+1;i++){
			sum=sum+i;	
		}
		System.out.println(sum);
	}

}
