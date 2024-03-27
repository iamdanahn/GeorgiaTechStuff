package HW02;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Set<String> validOperations = new HashSet<>(Set.of("add", "subtract", "multiply", "divide", "alphabetize"));

    // Ask question
    System.out.println("List of operations: add subtract multiply divide alphabetize");

    // Get and check if input operation is valid
    System.out.println("Enter an operation: ");
    String operation = input.next();
    String lowerOperation = operation.toLowerCase();
    // exit if invalid
    if (!validOperations.contains(lowerOperation)) {
      exitLine();
    }
    
  }
  
  private static void exitLine() {
    System.out.println("Invalid input entered. Terminating...");
  }
}