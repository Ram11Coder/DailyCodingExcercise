package matrix;

public class DiagonalMatrix {
	public static void main(String[] args) {

		int arr[][]=new int[][]{{1, 2,  3,  4},
								{5, 6,  7,  8},
								{9, 10, 11, 12},
								{13, 14, 15,16}
		};
		int n=arr.length,r,c;
		for(int i=0,j=0;j<2*n-1;j++) {
			
			if(j<n) {
				 r=i; c=j;				
				while(r<n && c>=0) 				
					System.out.print(arr[r++][c--]+" ");
				
			}else {
				i++; r=i; c=n-1;			
           while( r<n) 				
					System.out.print(arr[r++][c--]+" ");				
			}
		}
	}
}
