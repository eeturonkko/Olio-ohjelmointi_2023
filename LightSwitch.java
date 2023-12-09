public class LightSwitch implements Interactable {
  boolean isOn;

  public void interact() {
    if (isOn) {
      System.out.println("Lights turned off");
      isOn = false;
    } else {
      System.out.println("Lights turned on");
      isOn = true;
    }
  }
}
