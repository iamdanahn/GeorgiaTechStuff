public class Cat extends Pet {
  private int miceCaught;

  public Cat(String name, double health, int painLevel, int miceCaught) {
    super(name, health, painLevel);
    setMiceCaught(miceCaught);
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
}