package array;

public class Twosum {
	//I will improve the program optimize in future 
public static void main(String[] args) {
	int key =7;
	int arr[]= {1,3,1,8,4};
	boolean flag=false;
		
/**
 * Best approach
 * 1.Check the number which is near greater than 7
 * 2.Start iterate to till that index
 * 3.find the sum which is equal to 7 then print the true 
 */
for (int i = 0; i < arr.length; i++) {
	
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]+arr[j]==key) {
			flag=true;
			break;
		}
	}
}
if(flag==true)
System.out.println("True");
else
	System.out.println("False");

}

}
