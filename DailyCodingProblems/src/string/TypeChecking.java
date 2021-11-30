package string;

/**
 * While typing, it is possible to press a key long enough that it could get
 * typed more than once. Given two strings A and B, check if B could be a typed
 * version of A.
 *  Input 1:
 *   A = anime B = aanimeee
 *  Output 1: True 
 *   Input 2: A =Limcee B = Limmcce
 *  Output 2: False
 * 
 */
public class TypeChecking {

	public static void main(String[] args) {

		System.out.println(typeCheckApproach1("anime", "aanimeee"));
		System.out.println(typeCheckApproach1("Limcee", "Limmcce"));
		System.out.println(typeCheckApproach1(" ", "aanimeee"));

	}

	private static boolean typeCheckApproach1(String s1, String s2) {
		if (s1.isBlank() || s2.isBlank())
			return false;

		int j, k = 0;
		for (int i = 0; i < s1.length(); i++) {
			boolean flag = false;
			for (j = k; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j))
					flag = true;
				else
					break;
			}
			k = j;
			if (!flag)
				return false;
		}
		return true;
	}

}
