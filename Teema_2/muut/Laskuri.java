package Teema_2.muut;

public class Laskuri {

  public static double laskePintaAla(double pituus, double leveys) {
    double pintaAla = pituus * leveys;
    return pintaAla;
  }

  public static double laskePintaAla(double sade) {
    double pintaAla = (sade * sade) * Math.PI;
    return pintaAla;
  }
}