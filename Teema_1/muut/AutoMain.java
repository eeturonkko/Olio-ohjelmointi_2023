package Teema_1.muut;

public class AutoMain {
  public static void main(String[] args) {
    Auto auto1 = new Auto();
    auto1.merkki = "Toyota";
    auto1.malli = "Corolla";
    auto1.bensanMaara = 5;

    auto1.naytaTiedot();
    auto1.kiihdyta();
    auto1.naytaTiedot();

    Auto auto2 = new Auto("Honda", "Civic", 10);
    auto2.naytaTiedot();
    auto2.tankkaa(5);
    auto2.naytaTiedot();
  }
}
