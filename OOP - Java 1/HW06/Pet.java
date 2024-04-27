public abstract class Pet {
// This class represents any pet that would seek consultation from the clinic.

  private String name;
  private double health; // percentage ranging from 0.0 to 1.0
  private int painLevel; // 1 to 10

  public Pet(String name, double health, int painLevel) {
    this.name = name;
    setHealth(health);
    setPainLevel(painLevel);
  }

  public String getName() {
    return this.name;
  }
  public double getHealth() {
    return this.health;
  }
  public int getPainLevel() {
    return this.painLevel;
  }
  public void setHealth(double health) {
    if (health > 1.0) {
      this.health = 1.0;
    } else if (health < 0.0) {
      this.health = 0.0;
    }
  }
  public void setPainLevel(double painLevel) {
    if (painLevel > 10) {
      this.painLevel = 10;
    } else if (painLevel < 1) {
      this.painLevel = 1;
    }
  }

  // Should be an abstract method that returns the time taken (in minutes) to treat the pet
  public abstract int treat();

}