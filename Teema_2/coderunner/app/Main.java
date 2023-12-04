package Teema_2.coderunner.app;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Width?");
    int width = scanner.nextInt();
    System.out.println("Length?");
    int length = scanner.nextInt();
    int vastaus = Utils.areaCalc(width, length);
    System.out.println("Area is " + vastaus);
    scanner.close();
  }
}
