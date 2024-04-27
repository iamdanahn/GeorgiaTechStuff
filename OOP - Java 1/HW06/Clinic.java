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
    patientFile = file;
    Scanner fileScan = null;

  }
  public Clinic(String fileName) {
    String inputFile = fileName.substring(0, fileName.length() - 4);
    File fileIn = new File(inputFile);
    this(fileIn);
  }

  public String nextDay(File f) throws FileNotFoundException {
    File fileIn = new File(f);
    Scanner scan = null;
    String[] info = new String[4];

    scan = new Scanner(fileIn);
    int index = 0;
    while (scan.hasNext()) {
      String part = scan.next(",")
    }
  }

  public String nextDay(String fileName) throws FileNotFoundException {
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
// Pillow,Cat,5,1839 
// Atlas,Cat,2,1742 
// Cocoa,Dog,1.4,1630 
// Starbs,Cat,10,1240 
// Tucker,Dog,7.9,0918