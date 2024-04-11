public class Frog {
  private String name;
  private int age; // months
  private double tongueSpeed;
  private boolean isFroglet; // froglets are > 1 month & < 7 months
  
  private static final String species = "Rare Pepe";

  public Frog(String name) {
    this(name, 0.4166, 5.0);
  }

  public Frog(String name, double ageInYears, double tongueSpeed) {
    this(name, int(ageInYears), tongueSpeed);
  }

  public Frog(String name, int age, double tongueSpeed) {
    this.name = name;
    this.age = age;
    this.tongueSpeed = tongueSpeed;
  }

  public String getName() {
    return this.name;
  }
  private String setName(String newName) {
    return this.name = newName;
  }
  public int getAge() {
    return this.age;
  }
  private int setAge(int newAge) {
    return this.age = getAge() + newAge; // months
  }
  public double getTongueSpeed() {
    return this.tongueSpeed;
  }
  private double setTongueSpeed(double newTongueSpeed) {
    return this.tongueSpeed = getTongueSpeed() + newTongueSpeed;
  }
  public boolean getIsFroglet() {
    int age = getAge()
    return age > 1 && age < 7;
  }
  private boolean setIsFroglet(boolean newIsFroglet) {
    return this.isFroglet = newIsFroglet;
  }
  
  public static void main(String[] args) {
  }


  public void grow(int months) {
    setAge(months);

    for (int i = 0; i < months; i++) {
      int ageInMonths = getAge();
      if (ageInMonths < 12) {
        setTongueSpeed(1);
      } else if (ageInMonths >= 30 && getTongueSpeed() > 5) {
        setTongueSpeed(-1);
      }
    }

    setIsFroglet(getIsFroglet());
  }

  public void grow() {
    grow(1);
  }
}