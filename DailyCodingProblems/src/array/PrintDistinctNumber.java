package array;
/**
 * 
 *  Given an array of numbers. Print the numbers without duplication. 
  INPUT  :  
  Enter the array size  :  4
  Enter the elements  :  1 1 2 4
  OUTPUT  :
 
  1 2 4 

 *
 */
public class PrintDistinctNumber {
	//Need to improve further
	public static void main(String[] args) {

		int arr[]= {1,1,2,3};
		
	
		for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) {
				arr[j]=-1;
			}
		}
		} 
		
		for(int k:arr) {
			if(k!=-1) {
				System.out.print( k+" ");
			}
		}
	}
}
