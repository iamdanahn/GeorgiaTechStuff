public class Frog {
  private String name;
  private int age;
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
    return this.age = newAge;
  }
  public double getTongueSpeed() {
    return this.tongueSpeed;
  }
  private double setTongueSpeed(double newTongueSpeed) {
    return this.tongueSpeed = newTongueSpeed;
  }
  public boolean getIsFroglet() {
    return this.isFroglet;
  }
  private boolean setIsFroglet(boolean newIsFroglet) {
    return this.isFroglet = newIsFroglet;
  }
  
  public static void main(String[] args) {
  }

  public 

  private void grow(int months) {
    
  }
}