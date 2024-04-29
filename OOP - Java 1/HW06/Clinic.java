import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Clinic {
  // This is a class representing the vet clinic.

  private File patientFile;
  private int day;

  public Clinic(File file) {
    this.patientFile = file;
    this.day = 1;
  }
  public Clinic(String fileName) {
    this(new File(fileName));
  }

  public String nextDay(File f) throws FileNotFoundException {
    day++;

    String output = "";

    Scanner fileScan = new Scanner(f);
    Scanner input = new Scanner(System.in);
    String line = null;

    while (fileScan.hasNextLine()) {
      line = fileScan.nextLine();
      String[] petInfo = line.split(",");
      String name = petInfo[0];
      String species = petInfo[1];
      String stat = petInfo[2];
      String timeIn = petInfo[3];

      if ( !(species.equals("Dog") || !species.equals("Cat") )) {
        throw new InvalidPetException();
      }

      System.out.printf("Consultation for %s the %s at %s.\n", name, species, timeIn);
      double health = 0;
      int painLevel = 0;
      boolean validHealth = false;
      boolean validPain = false;
      while (!validHealth) {
        System.out.printf("What is the health of %s?\n", name);

        if (input.hasNextDouble()) {
          health = input.nextDouble();
          validHealth = true;
        } else {
          input.nextLine();
          System.out.println("Please enter a number");
        }
      }

      while (!validPain) {
        System.out.printf("On a scale of 1 to 10, how much pain is %s " + "in right now?\n", name);

        if (input.hasNextInt()) {
          painLevel = input.nextInt();
          validPain = true;
        } else {
          input.nextLine();
          System.out.println("Please enter a number");
        }
      }

      Pet petPatient;
      switch (species) {
        case "Dog":
          petPatient = new Dog(name, health, painLevel, Double.parseDouble(stat));
          break;
        case "Cat":
          petPatient = new Cat(name, health, painLevel, Integer.parseInt(stat));
          break;
        default:
          throw new InvalidPetException();
      }

      health = petPatient.getHealth();
      painLevel = petPatient.getPainLevel();
      petPatient.speak();
      int treatmentTime = petPatient.treat();
      String timeOut = addTime(timeIn, treatmentTime);
      output += String.format("%s, %s, %s, Day %d, %s, %s, %s, %d\n", name, species, stat, day, timeIn, timeOut, String.valueOf(health), painLevel);
    }

    fileScan.close();
    input.close();
    return output.trim();
  }

  public String nextDay(String fileName) throws FileNotFoundException {
    return nextDay(new File(fileName));
  }


  // Takes in this format:
  // [Name],[Species],[DroolRate/MiceCaught],[Day],[EntryTime],[ExitTime],[InitialHealth],[InitialPainLevel]
  public boolean addToFile(String patientInfo) {
    Scanner fileScan = null;
    PrintWriter filePrint = null;
    String stringOutput = "";
    
    try {
      fileScan = new Scanner(patientFile);

      boolean newPatient = true;
      int firstDelim = patientInfo.indexOf(",");
      String name = patientInfo.substring(0, firstDelim);

      while (fileScan.hasNextLine()) {
        String line = fileScan.nextLine();

        if (line.startsWith(name)) {
          newPatient = false;
          int currentDelim = firstDelim;
          for (int i = 2; i <= 3; i++) {
            int nextDelim = patientInfo.indexOf(",", currentDelim + 1);
            currentDelim = nextDelim;
          }

          line += patientInfo.substring(currentDelim);
        }
        stringOutput += (line + "\n");
      }

      fileScan.close();
      filePrint = new PrintWriter(patientFile);
      filePrint.print(stringOutput);
      return true;
    } catch (Exception e) {
      return false;
    } finally {
      
      if (fileScan != null) {
        fileScan.close();
      }
      if (filePrint != null) {
        filePrint.close();
      }
    }
  }

  private String addTime(String timeIn, int treatmentTime) {
    int hours = Integer.parseInt(timeIn.substring(0, 2));
    int mins = Integer.parseInt(timeIn.substring(2));
    int hourOut = hours + (int) ((mins + treatmentTime) / 60);
    int minOut = (mins + treatmentTime) % 60;

    String output = "";
    output += (hourOut < 10) ? ("0" + hourOut) : hourOut;
    output += (minOut < 10) ? ("0" + minOut) : minOut;
    return output;
    
    // String[] time = timeIn.split(":");
    // int hours = Integer.parseInt(time[0]);
    // int mins = Integer.parseInt(time[1]);

    // int totalTime = hours * 60 + mins + treatmentTime;

    // int totalHours = totalTime / 60;
    // int totalMins = totalTime % 60;

    // return totalHours + ":" + totalMins;
  }
}
