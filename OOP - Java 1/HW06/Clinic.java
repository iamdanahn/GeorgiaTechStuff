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
    patientFile = new File(file);

  }
  public Clinic(String fileName) {
    String inputFile = fileName.substring(0, fileName.length() - 4);
    File fileIn = new File(inputFile);
    this(fileIn);
  }
}