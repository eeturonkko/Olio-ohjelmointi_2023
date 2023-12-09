package Teema_2.muut;

public class PacmanMain {

  public static void main(String[] args) {

    Pacman pacman = new Pacman();

    Fruit fruit1 = new Fruit();
    Fruit fruit2 = new Fruit();
    Fruit fruit3 = new Fruit();

    pacman.eat(fruit2);

    Ghost ghost = new Ghost();
    ghost.syoPacman(pacman);

    System.out.println(fruit1.isVisible);
    System.out.println(fruit2.isVisible);
    System.out.println(fruit3.isVisible);

    pacman.printData();
  }

}

class Pacman {
  public int points;
  public int elamat;

  public Pacman() {
    points = 0;
    elamat = 3;
  }

  public void vahennaElama() {
    if (elamat > 0) {
      elamat--;
      System.out.println("Pacman syöty");
    }
  }

  public void printData() {
    System.out.println("Points: " + points);
    System.out.println("Elämät: " + elamat);
  }

  public void eat(Fruit eatenFruit) {
    System.out.println("Pac-Man ate fruit");
    eatenFruit.disappear();
  }
}

class Ghost {
  public void syoPacman(Pacman pacman) {
    pacman.vahennaElama();
  }
}

class Fruit {
  public boolean isVisible;

  public Fruit() {
    isVisible = true;
  }

  public void disappear() {
    isVisible = false;
    System.out.println("Fruit is hidden");
  }
}
