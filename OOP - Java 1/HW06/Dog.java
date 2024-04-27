public class Dog extends Pet {
  private double droolRate;

  public Dog(String name, double health, int painLevel, double droolRate) {
    super(name, health, painLevel);
    setDroolRate(droolRate);
  }
  public Dog(String name, double health, int painLevel) {
    this(name, health, painLevel, 5.0);
  }

  public double getDroolRate() {
    return this.droolRate;
  }
  public void setDroolRate(double droolRate) {
    this.droolRate = droolRate;

    if (droolRate <= 0) {
      this.droolRate = 0.5;
    }
  }
}