public class Dog {
  private double size;
  private String name;

  public Dog(String name, double size) {
    this.name = name;
    this.size = size;
  }

  public boolean equals(Object o) {
    if (!(o instanceof Dog)) {
      return false;
    }

    Dog doggy = (Dog) o;
    return ((doggy.size == size) && doggy.name.equals(name));
  }

  public static void main(String[] args) {
    Dog dog1 = new Dog("Spot", 9.6000001);
    Dog dog2 = new Dog("Spot", 9.6);
    System.out.println(dog1.equals(dog2));
  }

}