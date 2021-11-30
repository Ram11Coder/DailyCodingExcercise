package string;

public class EncodeString {
	public static void main(String[] args) {
		String str = "a1b19c2d2m3e231";
		char arr[] = str.toCharArray();

		char c = arr[0];
		int i = 0, sum = 0;
		while (i < arr.length - 1) {

			if (arr[i] >= 'a' && arr[i] <= 'z')
				c = arr[i];

			if (arr[i] >= '0' && arr[i] <= '9' && !(arr[i + 1] >= 'a' && arr[i + 1] <= 'z'))
				sum = sum * 10 + Integer.parseInt(String.valueOf(arr[i]));

			else if (arr[i + 1] >= 'a' && arr[i + 1] <= 'z') {
				sum = sum * 10 + Integer.parseInt(String.valueOf(arr[i]));
				printSequence(c, sum);
				sum = 0;
			}
			i++;
		}

		sum = sum * 10 + Integer.parseInt(String.valueOf(arr[i]));
		printSequence(c, sum);
		sum = 0;

	}

	private static void printSequence(char c, int sum) {
		while (sum-- > 0) {
			System.out.print(c);
		}

	}
}
