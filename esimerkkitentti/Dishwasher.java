package esimerkkitentti;

public class Dishwasher {
  private int programme;
  private boolean isOn;

  // * Constructors */

  public Dishwasher() {
    programme = 1;
    isOn = false;
    printData();
  }

  public Dishwasher(int programme, boolean isOn) {
    this.programme = programme;
    this.isOn = isOn;
    printData();
  }

  // * Getters */

  public boolean getIsOn() {
    return isOn;
  }

  // * Methods */
  public void setProgramme(int programme) {
    this.programme = programme;
    switch (programme) {
      case 1:
        System.out.println("Normal");
        break;
      case 2:
        System.out.println("Auto");
        break;
      case 3:
        System.out.println("Intensive");
        break;
      default:
        break;
    }
  }

  public void turnOnOff() {
    if (isOn) {
      isOn = false;
    } else {
      isOn = true;
    }
  }

  private void printData() {
    System.out.println("Is the dishwasher on: " + isOn);
    System.out.println("Programme: " + programme);

  }
}
