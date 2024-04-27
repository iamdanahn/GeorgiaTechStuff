public class Cat extends Pet {
  private int miceCaught;

  public Cat(String name, double health, int painLevel, int miceCaught) {
    super(name, health, painLevel);
    setMiceCaught(miceCaught);
  }
  public Cat(String name, double health, int painLevel) {
    this(name, health, painLevel, 0);
  }

  public int getMiceCaught() {
    return this.miceCaught;
  }
  public void setMiceCaught(int miceCaught) {
    this.miceCaught = miceCaught;
    if (miceCaught < 0) {
      this.miceCaught = 0;
    }
  }

  public int treat() {
    int timeTaken;
    heal();

    int miceCaught = getMiceCaught();
    if (miceCaught < 4) {
      timeTaken = (int)Math.ceil((getPainLevel() * 2) / getHealth());
    } else if (miceCaught >= 4 && miceCaught <= 7) {
      timeTaken = (int)(getPainLevel() / getHealth());
    } else {
      timeTaken = (int)Math.ceil(getPainLevel() / (getHealth() * 2));
    }

    return timeTaken;
  }

  public void speak() {
    super.speak();
    int miceCaught = getMiceCaught();
    String[] mice = new String[miceCaught];

    for (int i = 0; i < miceCaught; i++) {
      if (miceCaught > 5) {
        mice[i] = "MEOW";
      } else {
        mice[i] = "meow";
      }
    }

    System.out.println(String.join(" ", mice));
  }

  public boolean equals(Object o) {
    if (o instanceof Cat) {
      Cat other = (Cat) o;
      return (getMiceCaught() == other.getMiceCaught()) && super.equals(o);
    }

    return false;
  }
}