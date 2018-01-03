package practiceClasses;

public class StringContainsnum {
	public static void main(String[] args) {
		
		String a="sjguggkj2gjhg7";
		int sum=0;
		//a = a.replaceAll("\\D+","");
	//	System.out.println("digits are " + a);
		for(int i=0;i<a.length();i++){
			if(a.charAt(i) >= '0' &&  a.charAt(i) <= '9'){
				System.out.println(a.charAt(i));	
				sum=sum+Integer.parseInt(String.valueOf(a.charAt(i)));
			}		
		}
		System.out.println(sum);	
	}
}

//ASCII-0-9,A-Z,a-z