package practiceClasses;

import java.util.Scanner;

public class Pallendrome {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String word=sc.nextLine();
String newWord="";
for(int i=word.length()-1;i>=0;i--){
	newWord=newWord+word.charAt(i);	
}
if(word.equalsIgnoreCase(newWord)){
	System.out.println("is pallendrome");
	
}
else
	System.out.println("not a pallendrome");
}

}
