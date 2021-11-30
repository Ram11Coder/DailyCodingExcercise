package string;

/**
 * Given three strings s1,s2,s3.Remove commonly occurring words or sentences in
 * all the three strings.
 *  The strings are: 
 *  s1 = "Everyday I do exercise if" 
 *  s2 ="Sometimes I do exercise if i feel stressed" 
 * s3 = "Mostly I do exercise on morning"
 * 
 * 
 * Output: s1 = "Everyday if" 
 * s2 = "Sometimes if i feel stressed"
 *  s3 = "Mostly on morning"
 *
 */
public class OccurringWords {
	public static void main(String[] args) {

		String s1 = "Everyday I do exercise if";
		String s2 = "Sometimes I do exercise if i feel stressed";
		String s3 = "Mostly I do exercise on morning";
		removeOccuringWords(s1, s2, s3);
	}

	private static void removeOccuringWords(String s1, String s2, String s3) {

		removeWords(s1, s2, s3);
		removeWords(s2, s1, s3);
		removeWords(s3, s1, s2);
	}

	private static void removeWords(String s1, String s2, String s3) {
		String[] arr = s1.split(" ");

		for (String s : arr) {
			if (s2.contains(s) && s3.contains(s))
				s1 = s1.replace(s + " ", "");
		}
		System.out.println(s1);

	}
}
