package Teema_1.coderunner.CarApp;

class Car {
  private String brand, model;
  private int amountOfFuel;

  public Car() {
    brand = "";
    model = "";
    amountOfFuel = 0;
  }

  public Car(String brand, String model, int amountOfFuel) {
    this.brand = brand;
    this.model = model;
    this.amountOfFuel = amountOfFuel;
    printData();
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void brake() {
    System.out.println("Car is breaking");
  }

  public void accelerate() {
    if (amountOfFuel > 0) {
      amountOfFuel--;
      System.out.println("Car is accelerating");
    }
  }

  public void refuel(int amount) {
    System.out.println("Fuel in the tank: " + amountOfFuel);
    System.out.println("Refuel: " + amount);
    System.out.println("Fuel in the tank after the refuel: " + (amountOfFuel + amount));
  }

  private void printData() {
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Fuel: " + amountOfFuel);
  }
}
