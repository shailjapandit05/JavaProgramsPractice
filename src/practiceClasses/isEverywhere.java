package practiceClasses;

public class isEverywhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 2, 1, 3, 4};
		boolean val = true;
		for (int i=0;i<a.length-1;i++) {

			if(a[i]==1 || a[i+1]==1){
				val = true;
			}
			else
				val = false;
		}
		
		if(val)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

	}

}
