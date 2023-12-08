package Teema_1.muut;

import java.util.Scanner;

public class AutoMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /*
     * Auto auto1 = new Auto();
     * auto1.merkki = "Toyota";
     * auto1.malli = "Corolla";
     * auto1.bensanMaara = 5;
     * 
     * auto1.naytaTiedot();
     * auto1.kiihdyta();
     * auto1.naytaTiedot();
     * 
     * Auto auto2 = new Auto("Honda", "Civic", 10);
     * auto2.naytaTiedot();
     * auto2.tankkaa(5);
     * auto2.naytaTiedot();
     */

    System.out.println("Anna auton merkki: ");
    String merkki = scanner.nextLine();
    System.out.println("Anna auton malli: ");
    String malli = scanner.nextLine();
    System.out.println("Anna auton bensan määrä: ");
    int bensanMaara = scanner.nextInt();
    Auto auto3 = new Auto(merkki, malli, bensanMaara);
    auto3.naytaTiedot();
    auto3.kiihdyta();
    auto3.jarruta();
    auto3.kiihdyta();
    auto3.kiihdyta();
    auto3.naytaTiedot();
    scanner.close();
  }
}
