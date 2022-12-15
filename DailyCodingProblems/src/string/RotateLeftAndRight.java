package string;

public class RotateLeftAndRight {
  public static void main(String[] args) {

    // Rotate by left
    System.out.println(leftRotate("Hello", 2));

    // Rotate by right
    System.out.println(rightRotate("Hello", 2));

    // Using left rotation to get the right rotation
    // Left rotation - 2
    // Right rotation - 2 ~ Left Rotation (total length - 2)
    System.out.println(rightRotateUsingLeftRotation("Hello", 2));
  }

  private static String rightRotateUsingLeftRotation(String word, int r) {
    System.out.print("Right roation using ");
    return leftRotate(word, word.length() - r);
  }

  public static String leftRotate(String word, int r) {
    System.out.println("Left Rotation by " + r);
    return word.substring(r) + word.substring(0, r);
  }

  public static String rightRotate(String word, int r) {
    System.out.println("Right Rotation by " + r);
    int index = word.length() - r;
    return word.substring(index) + word.substring(0, index);
  }
}
