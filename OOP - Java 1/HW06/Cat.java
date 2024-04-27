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
      timeTaken = Math.ceil((getPainLevel() * 2) / getHealth());
    } else if (miceCaught >= 4 && miceCaught <= 7) {
      timeTaken = getPainLevel() / getHealth();
    } else {
      timeTaken = Math.ceil(getPainLevel() / (getHealth() * 2));
    }

    return timeTaken;
  }
}