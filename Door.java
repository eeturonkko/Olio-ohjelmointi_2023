public class Door extends Interactable {
  public Door() {
    isOn = false;
  }

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
