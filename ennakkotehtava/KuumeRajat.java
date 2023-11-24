package ennakkotehtava;

public class KuumeRajat {

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

  public static void main(String[] args) {
    tulostaKuumerajat();
    System.out.println("Ihmisellä on kuumetta: " + onkoKuumetta("ihminen", 38));
    System.out.println("Koiralla on kuumetta: " + onkoKuumetta("koira", 39));
    System.out.println("Hevosella on kuumetta: " + onkoKuumetta("hevonen", 37));
  }

}