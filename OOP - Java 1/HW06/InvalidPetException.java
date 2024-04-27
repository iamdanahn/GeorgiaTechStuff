public class InvalidPetException extends RuntimeException {
  // An unchecked exception with two constructors

  public InvalidPetException() {
    super("Your pet in invalid!");
  }

  public InvalidPetException(String s) {
    super(s);
  }
}