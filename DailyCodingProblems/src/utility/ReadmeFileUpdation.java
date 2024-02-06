package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Purpose of this to update the readme file upto date
 *
 */

public class ReadmeFileUpdation {
	private static final String USER_DIR = System.getProperty("user.dir");
	private static final String SRC_DIR = USER_DIR +File.separator + "src";
	private static final String README_FILE = Path.of(USER_DIR).getParent()
			+ File.separator  + "README.md";
	private static final String BRANCH_PATH = "https://github.com/Ram11Coder/DailyCodingExcercise/tree/master/DailyCodingProblems/src/";

	public static void main(String[] args) throws IOException {
		readmeUpdate();
	}

	private static void readmeUpdate() throws FileNotFoundException, IOException {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		File srcDir = new File(SRC_DIR);

		// Coding problem type will be list on high to low
		List<File> dirList = List.of(srcDir.listFiles()).stream()
				.sorted((o1, o2) -> o2.list().length - o1.list().length).collect(Collectors.toList());
		
		File file = new File(README_FILE);
		FileOutputStream fos = new FileOutputStream(file);

		StringBuilder sb = new StringBuilder();
		sb.append("# Daily Coding Practise").append("\n");

		for (File dir : dirList) {

			sb.append("### ").append(dir.getName().toUpperCase()).append("\n");
			sb.append("No").append("|").append("Problems").append("|").append("\n");
			sb.append(":---: | :---:|").append("\n");
			map.put(dir.getName().toUpperCase(), dir.list().length);
			int count = 1;
			for (String fileName : dir.list()) {
				if (fileName.contains(".java"))
					sb.append(count++).append("|[").append(fileName).append("](").append(BRANCH_PATH)
							.append(dir.getName()).append("/").append(fileName).append(")|").append("\n");
			}
			sb.append("\n");
		}
		sb.append("Topics").append("|").append("Problems").append("|").append("\n");
		sb.append(":---: | :---:|").append("\n");
		int total = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey()).append("|").append(entry.getValue()).append("|").append("\n");
			total += entry.getValue();
		}
		sb.append("TOTAL").append("|").append(total).append("|").append("\n");
		fos.write(sb.toString().getBytes());
		System.out.println("Readme File updated successfully...!");
		fos.flush();
		fos.close();
	}

}
