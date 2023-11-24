package ennakkotehtava;

import java.util.Scanner;

public class MetoditKertaus {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Valitse kohde. Kirjoita ihminen, koira tai hevonen.");
    String tutkittavaKohde = scanner.nextLine();
    System.out.println("Anna lampotila.");
    int lampotila = scanner.nextInt();
    tulostaKuumerajat();
    boolean onkoKuumetta = onkoKuumetta(tutkittavaKohde, lampotila);
    if (onkoKuumetta) {
      System.out.println("Kohteella on kuumetta.");
    } else {
      System.out.println("Kohteella ei ole kuumetta.");
    }

    scanner.close();
  }

  public static void tulostaKuumerajat() {
    System.out.println("Ihminen 37");
    System.out.println("Koira 39");
    System.out.println("Hevonen 38");
  }

  public static boolean onkoKuumetta(String tutkittavaKohde, int lampotila) {
    switch (tutkittavaKohde.toLowerCase()) {
      case "ihminen":
        return lampotila > 37;
      case "koira":
        return lampotila > 39;
      case "hevonen":
        return lampotila > 38;
      default:
        return false;
    }
  }

}
