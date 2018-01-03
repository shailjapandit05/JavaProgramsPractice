package practiceClasses;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a={{1,2,8},{6,8,5},{4,7,6}};
		int min=a[0][0];
		int mincol = 0,k = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(a[i][j]<min){
					min=a[i][j];
					mincol=j;
				}
				
			}		
			
		}
		System.out.println(min);
		int max=a[0][mincol];
		while (k<3){
			if(a[k][mincol]>max){
				max=a[k][mincol];
				
			}
			k++;
				
		}
		System.out.println(max);
		
		
	}

}
