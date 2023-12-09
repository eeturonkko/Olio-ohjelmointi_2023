package Teema_2.muut;

class Vieteriauto extends Lelu {
  private int nopeus;

  public Vieteriauto() {
    this.nopeus = 0;
  }

  public Vieteriauto(String nimi, double paino, int nopeus) {
    this.nopeus = nopeus;
    this.nimi = nimi;
    this.paino = paino;
  }

  public void kiihdyta() {
    nopeus++;
  }

  @Override
  public void tulostaTiedot() {
    System.out.println("Vieteriauto: Nimi = " + nimi);
    System.out.println("Vieteriauto: Paino = " + paino + " kg");
    System.out.println("Vieteriauto: Nopeus = " + nopeus + " km/h");
  }
}