package esimerkkitentti;

public class Main {
  public static void main(String[] args) {
    Dishwasher dishwasher = new Dishwasher();
    dishwasher.turnOnOff();
    dishwasher.setProgramme(3);
    System.out.println(dishwasher.getIsOn());
  }
}
