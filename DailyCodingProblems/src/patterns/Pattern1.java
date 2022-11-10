package patterns;

import java.util.stream.IntStream;

public class Pattern1 {
/*
n=5 

1
12
123
1234
12345

*/
public static void main(String[] args) {
		int n = 5;
	//	solution(n);
		
		//java 8
	solutionWithJava8(n);
	}

	private static void solutionWithJava8(int n) {
		IntStream.range(1, n+1).forEach(e ->{
					IntStream.range(1, e+1)
					.forEach(System.out::print);
					System.out.println();
					}
				);
	}

	private static void solution(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
