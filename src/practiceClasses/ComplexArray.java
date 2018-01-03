package practiceClasses;

public class ComplexArray {
	static int nums[]={1, 1, 3};
	public static void main(String[] args) {
		
		int leftSum = 0, rightSum = 0, i, j;
		
		i=0; j=nums.length-1;
		  for(; i<=j ;){
		      if(leftSum <= rightSum){
		         leftSum+=nums[i];
		         i++;
		      }else{
		         rightSum+=nums[j];
		         j--;
		      }
		  }
		  System.out.println("True");
		}
	}
