package tentti;

abstract class Device {
  protected boolean deviceOn = false;

  protected abstract void turnOnOff();
}
