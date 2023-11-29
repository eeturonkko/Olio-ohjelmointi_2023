package Teema_2.coderunner;

public class Dimmer extends LightSwitch {
  private int brightness;

  public void setBrightness(int brightness) {
    this.brightness = brightness;
    if (brightness == 0) {
      lightsOn = false;
    } else {
      lightsOn = true;
    }
  }

  public void printInfo() {
    if (brightness >= 50) {
      System.out.println("Brightness is " + brightness + ".");
    } else {
      super.printInfo();
    }
  }

}
