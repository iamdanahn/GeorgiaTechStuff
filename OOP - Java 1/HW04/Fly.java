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
  private double getMass() {
    return this.mass;
  }
  private double setMass(double mass) {
    return this.mass = mass;
  }
  private double getSpeed() {
    return this.speed;
  }
  private double setSpeed(double speed) {
    return this.speed = speed;
  }
}