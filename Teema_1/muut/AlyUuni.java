package Teema_1.muut;

public class AlyUuni extends Uuni {
  private boolean wifiYhteys;

  public AlyUuni() {
    super();
    this.wifiYhteys = false;
  }

  public AlyUuni(String malli, int lampotila, String toiminto, int tilavuus, boolean wifiYhteys) {
    super(malli, lampotila, toiminto, tilavuus);
    this.wifiYhteys = wifiYhteys;
  }

  public void yhdistaWiFiin(String verkkoNimi, String salasana) {

    System.out.println("Yhdistetään verkkoon: " + verkkoNimi);

    this.wifiYhteys = true;
  }

  // Setters ja Getters
  public void setWifiYhteys(boolean wifiYhteys) {
    this.wifiYhteys = wifiYhteys;
  }

  public boolean getWifiYhteys() {
    return this.wifiYhteys;
  }

  @Override
  public void tulostaTiedot() {
    super.tulostaTiedot();
    System.out.println("Wi-Fi yhteys: " + (this.wifiYhteys ? "kyllä" : "ei"));
  }
}
