import java.text.DecimalFormat;

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
  private double setMass(double mass) {
    return this.mass = mass;
  }
  public double getSpeed() {
    return this.speed;
  }
  private double setSpeed(double speed) {
    return this.speed = speed;
  }

  // methods
  private String toString() {
    DecimalFormat df = new DecimalFormat("#.00"); 
    String speed = df.format(getSpeed());
    
    if (getMass() == 0) {
      return "I’m dead, but I used to be a fly with a speed of " + speed;
    } else {
      String mass = df.format(getMass());
      return "I'm a speedy fly with " + speed + " speed and " + mass + " mass";
    }
  }

  public void grow(int addedMass) {
    Double newMass = getMass() + addedMass;
    setMass(newMass);

    if (getMass() < 20) {
      setSpeed(getSpeed() + 1);
    } else {
      setSpeed(getSpeed() - 0.5);
    }
  }

  private boolean isDead() {
    return getMass() == 0;
  }
}