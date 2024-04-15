public class Frog {
  // instance variables
  private String name;
  private int age;
  private double tongueSpeed;
  private boolean isFroglet;

  private static String species = "Rare Pepe";
  
  public static final int DEFAULT_AGE = 5;
  public static final double DEFAULT_TONGUESPEED = 5.0;

  // constructors
  public Frog(String name, int age, double tongueSpeed) {
    this.name = name;
    this.age = age;
    this.tongueSpeed = tongueSpeed;
    this.isFroglet(age);
  }

  public Frog(String name, double ageInYears, double tongueSpeed) {
    this(name, (int) (ageInYears * 12), tongueSpeed);
  }

  public Frog(String name) {
    this(name, DEFAULT_AGE, DEFAULT_TONGUESPEED);
  }

  // method
  private void isFroglet(int age) {
    if (age > 1 && age < 7) {
      isFroglet = true;
    } else {
      isFroglet = false;
    }
  }

  public void grow(int month) {
    for (int i = 0; i < month; i++) {
      if (age < 12) {
        tongueSpeed++;
      } else if (age >= 30 && tongueSpeed > 5) {
        tongueSpeed--;
        if (tongueSpeed < 5) {
          tongueSpeed = 5;
        }
      }
      age++;
    }
    this.isFroglet(age);
  }

  public void grow() {
    grow(1);
  }

  public void eat(Fly f) {
    if (f.isDead()) {
      return;
    }
    if (tongueSpeed > f.getSpeed()) {
      if (f.getMass() >= (0.5 * age)) {
        this.grow();
      }
      f.setMass(0);
    } else {
      f.grow(1);
    }
  }

  public String toString() {
    String speed = String.format("%.2f", tongueSpeed);

    if (isFroglet == true) {
      return "My name is " + name + " and I'm a rare froglet! I'm " + age + " months old and my tongue has a speed of "
          + speed + ".";
    } else {
      return "My name is " + name + " and I'm a rare frog. I'm " + age + " months old and my tongue has a speed of "
          + speed + ".";
    }
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

}