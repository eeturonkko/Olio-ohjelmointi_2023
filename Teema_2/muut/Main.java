package Teema_2.muut;

public class Main {
  public static void main(String[] args) {
    Lelu lelu = new Lelu("Nalle", 0.5);
    Vieteriauto auto = new Vieteriauto("Porsche", 1.5, 0);
    lelu.tulostaTiedot();
    auto.tulostaTiedot();
  }
}
