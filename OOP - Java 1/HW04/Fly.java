public class Fly {
  private double mass;
  private double speed;
  
  public Fly(double mass, double speed) {
    setMass(mass);
    setSpeed(speed);
  }
  public Fly(double mass) {
    this(mass, 10);
  }
  public Fly() {
    this(5);
  }

  // setters & getters
  public double getMass() {
    return this.mass;
  }
  public double setMass(double mass) {
    return this.mass = mass;
  }
  public double getSpeed() {
    return this.speed;
  }
  public double setSpeed(double speed) {
    return this.speed = speed;
  }

  // methods
  public String toString() {
    String speed = String.format("%.2f", getSpeed());
    
    if (getMass() == 0) {
      return "I’m dead, but I used to be a fly with a speed of " + speed;
    } else {
      String mass = String.format("%.2f", getMass());
      return "I'm a speedy fly with " + speed + " speed and " + mass + " mass.";
    }
  }

  public void grow(int addedMass) {

    for (int i = 0; i < addedMass; i++) {
      Double newMass = getMass() + 1;
      setMass(newMass);
    
      if (getMass() <= 20) {
        setSpeed(getSpeed() + 1);
      } else {
        setSpeed(getSpeed() - 0.5);
      }
    }

  }

  public boolean isDead() {
    return getMass() == 0;
  }
}