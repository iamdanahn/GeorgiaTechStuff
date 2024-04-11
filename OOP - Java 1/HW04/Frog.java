import java.text.DecimalFormat;

public class Frog {
  private String name;
  private int age; // months
  private double tongueSpeed;
  private boolean isFroglet; // froglets are > 1 month & < 7 months
  private String species = "Rare Pepe";

  public Frog(String name) {
    this(name, 0.4166, 5.0);
  }

  public Frog(String name, double ageInYears, double tongueSpeed) {
    
    this(name, int(ageInYears * 12), tongueSpeed);
  }

  public Frog(String name, int age, double tongueSpeed) {
    this.name = name;
    this.age = age;
    this.tongueSpeed = tongueSpeed;
  }

  protected String getName() {
    return this.name;
  }
  // protected String setName(String newName) {
  //   return this.name = newName;
  // }
  protected int getAge() {
    return this.age;
  }
  protected int setAge(int newAge) {
    return this.age = getAge() + newAge; // months
  }
  protected double getTongueSpeed() {
    return this.tongueSpeed;
  }
  protected double setTongueSpeed(double newTongueSpeed) {
    return this.tongueSpeed = getTongueSpeed() + newTongueSpeed;
  }
  protected boolean getIsFroglet() {
    int age = getAge()
    return age > 1 && age < 7;
  }
  protected boolean setIsFroglet(boolean newIsFroglet) {
    return this.isFroglet = newIsFroglet;
  }
  protected String getSpecies() {
    return this.species;
  }
  protected String setSpecies(String newSpecies) {
    return this.species = newSpecies
  }

  public void grow(int months) {
    setAge(months);

    for (int i = 0; i < months; i++) {
      int ageInMonths = getAge();
      if (ageInMonths < 12) {
        setTongueSpeed(1);
      } else if (ageInMonths >= 30 && getTongueSpeed() > 5) {
        setTongueSpeed(-1);
      }
    }

    setIsFroglet(getIsFroglet());
  }

  public void grow() {
    grow(1);
  }

  public void eat(Fly fly) {
    if (fly.isDead()) {
      return;
    }

    if (getTongueSpeed() > fly.getSpeed()) {
      // is caught
      if (fly.getMass() >= (0.5 * getAge()) ) {
        grow(1);
        fly.setMass(0);
      }
    } else {
      // not caught
      fly.grow(1);
    }
  }

  public String toString() {
    DecimalFormat df = new DecimalFormat("#.00"); 
    String speed = df.format(getTongueSpeed());

    if (getIsFroglet()) {
      return "My name is " + getName() + " and I'm a rare froglet! I'm " + getAge() + " months old and my tongue has a speed of " + speed + ".";
    } else {
      return "My name is " + getName() + " and I'm a rare frog. I'm " + getAge() + " months old and my tongue has a speed of " + speed + ".";
    }
  }
}