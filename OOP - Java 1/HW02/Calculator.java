package HW02;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Set<String> validOperations = new HashSet<>(Set.of("add", "subtract", "multiply", "divide", "alphabetize"));

    // #1 - Ask question
    System.out.println("List of operations: add subtract multiply divide alphabetize");

    // #2 - Get and check if input operation is valid
    System.out.println("Enter an operation: ");
    String operation = input.next();
    String lowerOperation = operation.toLowerCase();
    // exit if invalid
    if (!validOperations.contains(lowerOperation)) {
      exitLine();
      System.exit(0);
    }

    // #3 - perform chosen operation
    switch (lowerOperation) {
      case "add", "subtract":
        break;
      case "multiply", "divide":
        break;
      case "alphabetize":
        break;
      default:
        break;

    }

    
  }
  
  private static void exitLine() {
    System.out.println("Invalid input entered. Terminating...");
  }
}