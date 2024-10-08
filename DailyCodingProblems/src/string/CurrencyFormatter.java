package string;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    // String india = String.format("Rs.%,.2f", payment);
    String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
    scanner.close();

  }
}
