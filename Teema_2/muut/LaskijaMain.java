package Teema_2.muut;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LaskijaMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    System.out.println("Haluatko laskea suorakulmion (1) vai ympyrän (2) pinta-alan?");
    int valinta = scanner.nextInt();

    if (valinta == 1) {
      System.out.println("Anna suorakulmion pituus:");
      double pituus = scanner.nextDouble();
      System.out.println("Anna suorakulmion leveys:");
      double leveys = scanner.nextDouble();
      double tulos = Laskuri.laskePintaAla(pituus, leveys);
      System.out.println("Suorakulmion pinta-ala: " + df.format(tulos));
    } else if (valinta == 2) {
      System.out.println("Anna ympyrän säde:");
      double sade = scanner.nextDouble();
      double tulos = Laskuri.laskePintaAla(sade);
      System.out.println("Ympyrän pinta-ala: " + df.format(tulos));
    } else {
      System.out.println("Virheellinen valinta.");
    }

    scanner.close();
  }
}
