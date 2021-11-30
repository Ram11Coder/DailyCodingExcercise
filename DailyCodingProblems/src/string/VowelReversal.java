package string;

public class VowelReversal {
	public static void main(String[] args) {

		String str = "welcome to java world";
		int i = 0, j = str.length() - 1;
		char[] caarr = str.toCharArray();
		while (i < j) {

			if ((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U')) {
				// System.out.println(str.charAt(i) + " " + i);
				while (i <= j--) {
					if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
							|| str.charAt(j) == 'u' || str.charAt(j) == 'A' || str.charAt(j) == 'E'
							|| str.charAt(j) == 'I' || str.charAt(j) == 'O' || str.charAt(j) == 'U') {
						System.out.println(i + " " + j);
						// System.out.println(str.charAt(j) + " " + j);
						System.out.println(caarr[i] + " " + caarr[j]);
						char c = caarr[i];
						caarr[i] = caarr[j];
						caarr[j] = c;
					

						break;
					}

				}

			}

			i++;
		}
		System.out.println(String.valueOf(caarr));
	}

}
