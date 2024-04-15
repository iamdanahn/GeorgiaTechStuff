public class Fly {
  // instance variables
  private double mass;
  private double speed;
  public static final double DEFAULT_SPEED = 10;
  public static final double DEFAULT_MASS = 5;

  // constructors
  public Fly(double mass, double speed) {
    this.mass = mass;
    this.speed = speed;
  }

  public Fly(double mass) {
    this(mass, DEFAULT_SPEED);
  }

  public Fly() {
    this(DEFAULT_MASS, DEFAULT_SPEED);
  }

  // method
  public double getMass() {
    return mass;
  }

  public double getSpeed() {
    return speed;
  }

  public void setMass(double mass) {
    if (mass >= 0) {
      this.mass = mass;
    }
  }

  public void setSpeed(double speed) {
    if (speed > 0) {
      this.speed = speed;
    }
  }

  public String toString() {
    String speed = String.format("%.2f", getSpeed());

    if (mass == 0) {
      return "I'm dead, but I used to be a fly with speed of " + speed + ".";
    } else {
      String mass = String.format("%.2f", getMass());
      return "I'm a speedy fly with " + speed + " speed and " + mass + " mass.";
    }
  }

  public void grow(int addMass) {
    if (mass >= 20) {
      speed -= 0.5 * addMass;
    } else if (mass + addMass < 20) {
      speed += addMass;
    } else {
      int before20 = 20 - (int) mass;
      int after20 = (int) mass + addMass - 20;
      speed += before20 - 0.5 * after20;
    }
    mass += addMass;
    // int i = 0;
    // while (i != addMass) {
    //   mass++;
    //   if (mass <= 20) {
    //     speed++;
    //   } else {
    //     speed = speed - 0.5;
    //   }
    //   i++;
    // }
  }

  public boolean isDead() {
    return mass == 0;
  }
}