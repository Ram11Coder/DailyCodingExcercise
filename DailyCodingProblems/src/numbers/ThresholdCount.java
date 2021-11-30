package numbers;
/**
 * 

 * Given an array and a threshold value find the o/p
eg) i/p {5,8,10,13,6,2};threshold = 3;
      o/p  count = 17
      explanation:
Number	parts	            counts
5	            {3,2}                 2
8                      {3,3,2}              3
10                    {3,3,3,1}           4
13                    {3,3,3,3,1}        5
6                      {3,3}                 2
2                      {2}                    1
 *
 */
public class ThresholdCount {

	public static void main(String[] args) {
		
		int arr[]={5,8,10,13,6,13};
		int threshold=3,sum=0;
		
		for(int i:arr) 
			sum+=(i<threshold)?1:(i%threshold==0)?i/threshold:i/threshold+1;

		System.out.println(sum);

	}
}
