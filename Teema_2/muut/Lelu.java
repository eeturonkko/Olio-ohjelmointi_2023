package Teema_2.muut;

class Lelu {
  protected String nimi;
  protected double paino;

  public Lelu() {
    this.nimi = "";
    this.paino = 0;
  }

  public Lelu(String nimi, double paino) {
    this.nimi = nimi;
    this.paino = paino;
  }

  public void tulostaTiedot() {
    System.out.println("Lelun nimi: " + nimi);
    System.out.println("Lelun paino: " + paino);
  }
}
