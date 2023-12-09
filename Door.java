public class Door implements Interactable {
  boolean isOn;

  public void interact() {
    if (isOn) {
      System.out.println("Door closed");
      isOn = false;
    } else {
      System.out.println("Door opened");
      isOn = true;
    }
  }
}
