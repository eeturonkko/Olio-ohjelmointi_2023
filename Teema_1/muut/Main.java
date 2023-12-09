package Teema_1.muut;

public class Main {
  public static void main(String[] args) {
    Uuni uuni1 = new Uuni("Bosch", 0, "Kiertoilma", 50);
    Uuni uuni2 = new Uuni("Siemens", 0, "Ylä- ja alalämpö", 40);
    AlyUuni alyUuni1 = new AlyUuni("Miele", 0, "Grillivastus", 60, false);
    uuni1.tulostaTiedot();
    uuni2.tulostaTiedot();
    alyUuni1.yhdistaWiFiin("Koti", "salasana");
    alyUuni1.tulostaTiedot();
    alyUuni1.setWifiYhteys(false);
    alyUuni1.tulostaTiedot();
  }
}
