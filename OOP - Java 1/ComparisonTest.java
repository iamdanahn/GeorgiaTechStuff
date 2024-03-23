public class ComparisonTest {
  public static void main (String[] args) {
    String x = "park";
    String y = "p4rk";

    if (x.compareTo(y) > 0) {
      System.out.println("x is greater than y");
    } else if (x.compareTo(y) > 0) { 
      System.out.println("x is less than y");
    } else {
      System.out.println("x is equal to y");
    }
    System.out.println("x: " + x);
    System.out.println("y: " + y);
  }
}