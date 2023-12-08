public class LightSwitch extends Interactable {
  public LightSwitch() {
    isOn = false;
  }

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
