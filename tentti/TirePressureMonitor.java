package tentti;

public class TirePressureMonitor extends Device {
  private double minPressure, maxPressure, tirePressure;

  public TirePressureMonitor(double min, double max) {
    this.minPressure = min;
    this.maxPressure = max;
    this.tirePressure = 0;
  }

  public void setTirePressure(double tirePressure) {
    this.tirePressure = tirePressure;
  }

  public void updateHUD() {
    if (!deviceOn) {
      return;
    } else {
      System.out.println("Tire pressure: " + tirePressure);
      if (tirePressure >= minPressure && tirePressure <= maxPressure) {
        System.out.println("Tire pressure OK");
      } else {
        System.out.println("Check the tire pressure!");
      }
    }
  }

  @Override
  protected void turnOnOff() {
    if (deviceOn) {
      deviceOn = false;
      System.out.println("Device is off");
    } else {
      deviceOn = true;
      System.out.println("Device is on");
    }
  }
}
