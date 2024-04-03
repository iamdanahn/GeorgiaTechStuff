// package HW02;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // commented out due to import restricted to Scanner only
    // List<String> validOperations = new List<>("add", "subtract", "multiply", "divide", "alphabetize");

    // #1 - Ask question
    System.out.println("List of operations: add subtract multiply divide alphabetize");

    // #2 - Get and check if input operation is valid
    System.out.println("Enter an operation:");
    String operation = input.next();    
    String lowerOperation = operation.toLowerCase();


    // exit if invalid
    if (!lowerOperation.equals("add")      &&
        !lowerOperation.equals("subtract") &&
        !lowerOperation.equals("multiply") &&
        !lowerOperation.equals("divide")   &&
        !lowerOperation.equals("alphabetize") ) {
      exitLine();
    } else {
      // #3 - perform chosen operation
      switch (lowerOperation) {
        case "add", "subtract":
          System.out.println("Enter two integers:");
          try {
            int integer1 = input.nextInt();
            int integer2 = input.nextInt();
            int resultInt;
    
            if (lowerOperation.equals("add")) {
              resultInt = integer1 + integer2;
            } else {
              resultInt = integer1 - integer2;
            }
            System.out.println("Answer: " + resultInt);
          } catch (Exception e) {
            exitLine();
            break;
          }
  
          break;
        case "multiply", "divide":
          System.out.println("Enter two doubles:");
          try {
            double double1 = input.nextDouble();
            double double2 = input.nextDouble();

            if (double2 == 0 && lowerOperation.equals("divide")) {
              exitLine();
              break;
            }
    
            Double resultDouble;
            if (lowerOperation.equals("multiply")) {
              resultDouble = double1 * double2;
            } else {
              resultDouble = double1 / double2;
            }
            System.out.printf("Answer: %.2f\n", resultDouble);
            
          } catch (Exception e) {
            exitLine();
            break;
          }
  
          break;
        case "alphabetize":
          System.out.println("Enter two words:");
          try {
            String word1 = input.next();
            String word2 = input.next();
            String lowerWord1 = word1.toLowerCase();
            String lowerWord2 = word2.toLowerCase();
            Integer comparison = lowerWord1.compareTo(lowerWord2);

            if (comparison == 0) {
              System.out.println("Answer: Chicken or Egg.");
            } else if (comparison < 0) {
              System.out.printf("Answer: %s comes before %s alphabetically.\n", word1, word2);
            } else {
              System.out.printf("Answer: %s comes before %s alphabetically.\n", word2, word1);
            }
            
          } catch (Exception e) {
            exitLine();
            break;
          }
          break;
        default:
          break;
  
      } 
    }
    
  }
  
  private static void exitLine() {
    System.out.println("Invalid input entered. Terminating...");
  }
}