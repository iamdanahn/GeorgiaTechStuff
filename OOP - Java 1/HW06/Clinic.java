import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Clinic() {
  // This is a class representing the vet clinic.

  private File patientFile;
  private int day;

  public Clinic(File file) {
    this.patientFile = file;
  }
  public Clinic(String fileName) {
    File fileIn = new File(inputFile);
    this(fileIn);
  }

  public String nextDay(File f) throws FileNotFoundException {
    File fileIn = new File(f);
    Scanner scan = null;
    String[] info = new String[4];
    
    scan = new Scanner(fileIn);
    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      String[] petInfo = line.split(",");
      
      String name = petInfo[0];
      String typeOfPet = petInfo[1];
      String count = petInfo[2];
      String entryTime = petInfo[3];
      
      if (typeOfPet != "Dog" || typeOfPet != "Cat") {
        throw InvalidPetException;
      }

      Scanner input = new Scanner(System.in);
      System.out.printf("Consultation for %s the %s at %s \nWhat is the health of %s?\n", name, typeOfPet, entryTime, name);
      
      int health = null;
      boolean validNum = false;
      while (!validNum) {
        
        if (input.hasNextInt()) {
          health = input.nextInt();
          validNum = true;
        } else {
          System.err.println("Please enter a number");
        }
      }

      if (typeOfPet == "Dog") {
        Dog pet = new Dog(name, health, health))
      }
      speak



    }
  }

  public String nextDay(String fileName) throws FileNotFoundException {
  }


  // Takes in this format:
  // [Name],[Species],[DroolRate/MiceCaught],[Day],[EntryTime],[ExitTime],[InitialHealth],[InitialPainLevel]
  public boolean addToFile(String patientInfo) {
    try {
      

      return true;
    } catch (err) {
      return false;
    }
  }

  private String addTime(String timeIn, int treatmentTime) {
    String[] time = timeIn.split(":");
    int hours = (int)time[0];
    int mins = (int)time[1];

    int totalTime = hours * 60 + mins + treatmentTime;

    int totalHours = totalTime / 60;
    int totalMins = totalTime % 60;

    return totalHours.toString() + ":" + totalMins.toString();
  }
}

// Patients.csv file
// [Name],[Species],[DroolRate/MiceCaught],[Day],[EntryTime],[ExitTime],[InitialHealth],[InitialPainLevel]
// Freckles,Cat,5,Day 2,1243,1249,0.68,4 
// Spots,Dog,6.6,Day 1,1713,1727,0.7,10,Day 3,1240,1245,0.8,4 
// Susan,Cat,2,Day 3,1403,1515,0.11,4 
// Dolf,Dog,0.1,Day 1,1523,1539,0.9,7 
// Margie,Cat,8,Day 2,1653,1656,0.6,3

// Appointments.csv file
// [Name],[Species],[DroolRate/MiceCaught],[EntryTime]
// Pillow,Cat,5,1839 
// Atlas,Cat,2,1742 
// Cocoa,Dog,1.4,1630 
// Starbs,Cat,10,1240 
// Tucker,Dog,7.9,0918