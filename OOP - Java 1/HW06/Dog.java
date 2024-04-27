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

  public int treat() {
    int timeTaken;
    heal();

    double droolRate = getDroolRate();
    if (droolRate < 3.5) {
      timeTaken = (int)Math.ceil((getPainLevel() * 2) / getHealth());
    } else if (droolRate >= 3.5 && droolRate <= 7.5) {
      timeTaken = (int)(getPainLevel() / getHealth());
    } else {
      timeTaken = (int)Math.ceil(getPainLevel() / (getHealth() * 2));
    }

    return timeTaken;
  }

  public void speak() {
    super.speak();
    int painLevel = getPainLevel();
    String[] barks = new String[painLevel];

    for (int i = 0; i < painLevel; i++) {
      if (painLevel > 5) {
        barks[i] = "BARK";
      } else {
        barks[i] = "bark";
      }
    }

    System.out.println(String.join(" ", barks));
  }

  public boolean equals(Object o) {
    if (o instanceof Dog) {
      Dog other = (Dog)o;
      return (getDroolRate() == other.getDroolRate()) && super.equals(o);
    }
    
    return false;
  }
}