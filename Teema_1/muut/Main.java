package Teema_1.muut;

public class Main {
  public static void main(String[] args) {
    Uuni uuni1 = new Uuni("Bosch", 0, "Kiertoilma", 50);
    Uuni uuni2 = new Uuni("Siemens", 0, "Ylä- ja alalämpö", 40);
    uuni1.tulostaTiedot();
    uuni2.tulostaTiedot();
    uuni1.muutaTiedot("Miele", 225, 0, "Grillivastus", 60);
    uuni1.tulostaTiedot();
    uuni2.kaynnistaUuni();
    uuni2.saadaLampotila(200);
    uuni2.asetaAjastin(30);
    uuni2.valitseToiminto("Ylä- ja alalämpö");
    uuni2.sammutaUuni();
  }
}
