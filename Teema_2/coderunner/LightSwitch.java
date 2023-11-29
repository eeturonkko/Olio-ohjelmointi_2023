package Teema_2.coderunner;

class LightSwitch {
  protected boolean lightsOn;

  protected void printInfo() {
    if (lightsOn) {
      System.out.println("Lights are on.");
    } else {
      System.out.println("Lights are off.");
    }
  }
}
