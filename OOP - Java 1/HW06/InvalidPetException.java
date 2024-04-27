public class InvalidPetException extends Exception {
  // An unchecked exception with two constructors

  public InvalidPetException() {
    super("Your pet in invalid!");
  }

  public InvalidPetException(String s) {
    super(s);
  }
}