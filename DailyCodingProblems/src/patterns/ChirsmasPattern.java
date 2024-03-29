package patterns;

import java.util.Scanner;

/*
 * 						 * 
                        * * 
                       * * * 
                      * * * * 
                     * * * * * 
                       * * * 
                      * * * * 
                     * * * * * 
                    * * * * * * 
                   * * * * * * * 
                     * * * * * 
                    * * * * * * 
                   * * * * * * * 
                  * * * * * * * * 
                 * * * * * * * * * 
                   * * * * * * * 
                  * * * * * * * * 
                 * * * * * * * * * 
                * * * * * * * * * * 
               * * * * * * * * * * * 
                 * * * * * * * * * 
                * * * * * * * * * * 
               * * * * * * * * * * * 
              * * * * * * * * * * * * 
             * * * * * * * * * * * * * 
                      * * * * 
                      * * * * 
                      * * * * 
                      * * * * 
 */
public class ChirsmasPattern {
	static {
		System.out.println("[---------HAPPY CHIRSTMAS------------]\n");

	}

	/**
	 * 
	 * The below code modified based on the size of tree, so tree won't collapse as
	 * long as space and trunk grows
	 * 
	 */
	public static void main(String[] args) {
		// If the tree grows then increase the space and trunk size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the tree");
		int size = sc.nextInt();
		int n = 0, space = 25, trunkCount = 0;
		if (size > 11) {
			space = (space + (size - 11) * 2);
		}

		for (int i = 0; i < size; i++) {
			trunkCount = treeToptoBottom(n, space);
			n += 2;
			space -= 2;
		}
		// System.out.println(trunkCount);
		int trunkCountSpace = 0;
		/**
		 * If the size is less than 11 then trunkcount less than 25 we will trunk space
		 * subtracting both (25 - trunkcount), Adding 2 so we can absolute middle of
		 * trunk space
		 */
		if (size > 11)
			trunkCountSpace = trunkCount / 2;
		else
			trunkCountSpace = 25 - trunkCount + 2 + (trunkCount / 2);
//Printing trunk
		printTrunk(trunkCountSpace, trunkCount);
		sc.close();
	}

	private static void printTrunk(int space, int size) {
		for (int t = 0; t < size / 2; t++) {
			printSpace(space);
			for (int t1 = 0; t1 < size / 2; t1++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

	private static int treeToptoBottom(int n, int space) {
		int count = 0;
		for (int j = 0; j < 5; j++) {
			printSpace(space);
			for (int k = 0; k <= j + n; k++) {
				if (j == 4) {
					count++;
				}
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
		return count;
	}

	private static void printSpace(int space) {
		for (int i = 0; i < space; i++) {
			System.out.print(" ");
		}

	}
}
