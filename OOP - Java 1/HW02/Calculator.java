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
        System.out.println("Enter two intergers: ");
        Integer integer1 = input.nextInt();
        Integer integer2 = input.nextInt();

        Integer result;
        if (lowerOperation == "add") {
          result = integer1 + integer2;
        } else {
          result = integer1 - integer2;
        }
        System.out.print("Answer : " + result);
        
        break;
      case "multiply", "divide":
        System.out.println("Enter two doubles:");
        Double double1 = input.nextDouble();
        Double double2 = input.nextDouble();

        Double result;
        if (lowerOperation == "multiply") {
          result = double1 * double2;
        } else {
          result = double1 / double2;
        }
        System.out.print("Answer : " + result);

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