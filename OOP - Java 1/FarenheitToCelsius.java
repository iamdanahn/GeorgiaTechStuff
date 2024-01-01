import java.util.Scanner;
public class FarenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a Farenheit value: ");
    int farenheit = input.nextInt();
    
    System.out.print("Enter day of the week: ");
    String day = input.next();

    double celsius = (5.0/9) * (farenheit - 32);
    System.out.println(day + " Farenheit: " + farenheit);
    System.out.println(day + " Celsius: " + celsius);

    System.out.printf("%s Celsius: %.1f\n", day, celsius);
  }
}