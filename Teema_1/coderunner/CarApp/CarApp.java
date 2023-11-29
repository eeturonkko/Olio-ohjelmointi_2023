package Teema_1.coderunner.CarApp;

import java.util.Scanner;

public class CarApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car("Toyota", "RAV4", 40);
    boolean jatkuu = true;

    do {
      System.out.println("a=accelerate b=break x=exit");
      String command = scanner.nextLine();
      switch (command) {
        case "a":
          car.accelerate();
          break;
        case "b":
          car.brake();
          break;
        case "x":
          jatkuu = false;
          break;
        default:
          System.out.println("Unknown command");
          break;
      }
    } while (jatkuu);
    scanner.close();
  }
}
