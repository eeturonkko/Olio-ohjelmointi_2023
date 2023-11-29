package Teema_2.coderunner.app;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Width?");
    int width = scanner.nextInt();
    System.out.println("Length?");
    int length = scanner.nextInt();
    System.out.println("Area is " + Utils.areaCalc(width, length));
    scanner.close();
  }
}
