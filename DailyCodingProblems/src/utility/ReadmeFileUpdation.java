package utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Purpose of this to update the readme file upto date
 *
 */

public class ReadmeFileUpdation {
  private static final String SRC_DIR =
      "D:\\localRepository\\DaillyPractiseProblem\\DailyCodingProblems\\src";
  private static final String README_FILE =
      "D:\\localRepository\\DaillyPractiseProblem\\README1.md";

  public static void main(String[] args) throws IOException {

    File srcDir = new File(SRC_DIR);
    File[] dirList = srcDir.listFiles();

    File file = new File(README_FILE);
    FileOutputStream fos = new FileOutputStream(file);

    StringBuilder sb = new StringBuilder();
    sb.append("# Daily Coding Practise").append("\n");


    for (File dir : dirList) {

      sb.append("### ").append(dir.getName().toUpperCase()).append("\n");
      sb.append("No").append("|").append("Problems").append("|").append("\n");
      sb.append(":---: | :---:|").append("\n");

      int count = 1;
      for (String fileName : dir.list()) {
        sb.append(count++).append("|").append(fileName).append("|").append("\n");
      }
      sb.append("\n");
    }

    fos.write(sb.toString().getBytes());
    fos.flush();
    fos.close();
  }
}
