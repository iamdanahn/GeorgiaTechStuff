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
    System.out.print("Enter an operation: ");
    String operation = input.next();
    // System.out.println("operation: " + operation);
    
    String lowerOperation = operation.toLowerCase();
    System.out.println("lowerOperation: " + lowerOperation);

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
          System.out.print("Enter two intergers: ");
          Integer integer1 = input.nextInt();
          Integer integer2 = input.nextInt();
          Integer resultInt;
  
          if (lowerOperation.equals("add")) {
            resultInt = integer1 + integer2;
          } else {
            resultInt = integer1 - integer2;
          }
          System.out.print("Answer : " + resultInt);
  
          break;
        case "multiply", "divide":
          System.out.print("Enter two doubles:");
          Double double1 = input.nextDouble();
          Double double2 = input.nextDouble();
  
          Double resultDouble;
          if (lowerOperation.equals("multiply")) {
            resultDouble = double1 * double2;
          } else {
            resultDouble = double1 / double2;
          }
          System.out.print("Answer : " + resultDouble);
  
          break;
        case "alphabetize":
          System.out.print("Enter two words: ");
          String word1 = input.next();
          String word2 = input.next();
          Character char1 = word1.charAt(0);
          Character char2 = word1.charAt(0);
          Integer comparison = char1.compareTo(char2);
          
          if (comparison == 0) {
            System.out.println("Answer: Chicken or Egg.");
          } else if (comparison < 0) {
            System.out.printf("%s comes before %s alphabetically.", word1, word2);
          } else {
            System.out.printf("%s comes before %s alphabetically.", word2, word1);
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