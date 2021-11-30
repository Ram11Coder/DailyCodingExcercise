package string;

public class RemoveWords {
	public static void main(String[] args) {
		char s1[] = "Everyday I do exercise if".toCharArray();
		String s2 = "Sometimes I do exercise if i feel stressed";
		String s3 = "Mostly I do exercise on morning";
		int i = 0, j = s1.length, oldIndex = i;

		while (i < j) {
			if (s1[i] == ' ') {
				String word = s1.toString().substring(oldIndex, i - 1);
				isWordPresent(word, s2, s3);
			}
		}

	}

	static void isWordPresent(String word, String s2, String s3) {
if(s2.contains(word) && s3.contains(word)) {

}
	}
}
