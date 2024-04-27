import java.io.FileNotFoundException;

public class ClinicDriver {
/**
 * Driver class to demonstrate a Clinic treating various patients
 * Added this file just for reference
 */

  public static void main(String[] args) {
    Clinic clinic = new Clinic("Patients.csv");
    String dayOneReport = "";
    try {
      dayOneReport = clinic.nextDay("Appointments.csv");
    } catch (FileNotFoundException exception) {
      exception.printStackTrace();
    }
    String[] dayOneAppointments = dayOneReport.split("\\n");
    for (String appointment : dayOneAppointments) {
      if (!clinic.addToFile(appointment)) {
        System.out.println("Appointment could not be added to file!");
      }
    }
  }
}
