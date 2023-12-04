package Teema_1.muut;

public class Auto {

  public String merkki, malli;
  public int bensanMaara;

  public Auto() {
    this.merkki = "";
    this.malli = "";
    this.bensanMaara = 0;
  }

  public Auto(String merkki, String malli, int bensanMaara) {
    this.merkki = merkki;
    this.malli = malli;
    this.bensanMaara = bensanMaara;
  }

  // Metodit
  public void jarruta() {
    System.out.println("Auto jarruttaa");
  }

  public void kiihdyta() {
    if (this.bensanMaara > 0) {
      this.bensanMaara--;
      System.out.println("Auto kiihtyy");
    } else {
      System.out.println("Ei tarpeeksi bensaa kiihdyttämiseen");
    }
  }

  public void naytaTiedot() {
    System.out.println("Merkki: " + this.merkki + ", Malli: " + this.malli + ", Bensan määrä: " + this.bensanMaara);
  }

  public void tankkaa(int maara) {
    System.out.println("Tankissa bensaa: " + this.bensanMaara);
    System.out.println("Tankkaus: " + maara);
    this.bensanMaara += maara;
    System.out.println("Tankissa bensaa tankkauksen jälkeen: " + this.bensanMaara);
  }
}