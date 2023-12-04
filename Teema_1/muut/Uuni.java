package Teema_1.muut;

public class Uuni {
  // Attribuutit / ominaisuudet
  private String malli;
  private int lampotila;
  private int ajastin;
  private String toiminto;
  private int tilavuus;

  // Muodostimet / konstruktorit

  public Uuni() {
    this.malli = "";
    this.lampotila = 0;
    this.ajastin = 0;
    this.toiminto = "";
    this.tilavuus = 0;
  }

  public Uuni(String malli, int lampotila, String toiminto, int tilavuus) {
    this.malli = malli;
    this.lampotila = lampotila;
    this.ajastin = 0;
    this.toiminto = toiminto;
    this.tilavuus = tilavuus;
  }

  // Metodit / toiminnot
  public void saadaLampotila(int uusiLampotila) {
    this.lampotila = uusiLampotila;
    System.out.println(malli + " uunin lämpötila säädettäväksi: " + uusiLampotila + "°C");
  }

  public void asetaAjastin(int uusiAjastin) {
    this.ajastin = uusiAjastin;
    System.out.println(malli + " uunin ajastin asetettu: " + uusiAjastin + " min");
  }

  public void valitseToiminto(String uusiToiminto) {
    this.toiminto = uusiToiminto;
    System.out.println(malli + " uunin toiminto valittu: " + uusiToiminto);
  }

  public void kaynnistaUuni() {
    System.out.println(malli + " uuni käynnistetty.");
  }

  public void sammutaUuni() {
    System.out.println(malli + " uuni sammutettu.");
  }

  public void muutaTiedot(String uusiMalli, int uusiLampotila, int uusiAjastin, String uusiToiminto, int uusiTilavuus) {
    this.malli = uusiMalli;
    this.lampotila = uusiLampotila;
    this.ajastin = uusiAjastin;
    this.toiminto = uusiToiminto;
    this.tilavuus = uusiTilavuus;
  }

  // Setters

  public void setMalli(String malli) {
    this.malli = malli;
  }

  public void setLampotila(int lampotila) {
    this.lampotila = lampotila;
  }

  public void setAjastin(int ajastin) {
    this.ajastin = ajastin;
  }

  public void setToiminto(String toiminto) {
    this.toiminto = toiminto;
  }

  public void setTilavuus(int tilavuus) {
    this.tilavuus = tilavuus;
  }

  // Getters

  public String getMalli() {
    return this.malli;
  }

  public int getLampotila() {
    return this.lampotila;
  }

  public int getAjastin() {
    return this.ajastin;
  }

  public String getToiminto() {
    return this.toiminto;
  }

  public int getTilavuus() {
    return this.tilavuus;
  }

  // Tulosta uunin tiedot
  public void tulostaTiedot() {
    System.out.println("****** Uunin tiedot ******");
    System.out.println("Uunin malli: " + this.malli);
    System.out.println("Uunin lämpötila: " + this.lampotila + "°C");
    System.out.println("Uunin ajastin: " + this.ajastin + " min");
    System.out.println("Uunin toiminto: " + this.toiminto);
    System.out.println("Uunin tilavuus: " + this.tilavuus + " litraa");
  }
}
