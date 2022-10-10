package utility;

import java.util.List;

public class DSUtil {

	private DSUtil() {
	}

	public static int sum(List<Integer> list) {
		return list.stream().mapToInt(Integer::valueOf).sum();

	}

	public static void print(List<Integer> list) {
		list.stream().forEach(System.out::println);

	}
}
