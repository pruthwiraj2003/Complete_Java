package HospitalManagementSystem;

import java.sql.*;
import java.util.Scanner;

import static java.lang.Class.forName;

public class HospitalManagementSystem {
    private static final String url ="jdbc:mysql://localhost:3306/hospital";
    private static final String usernaname ="root";
    private static final String password ="Gugu@2003";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        try{
            Connection connection = DriverManager.getConnection(url,usernaname ,password);
            Patient patient = new Patient(connection,scanner);
            Doctor doctor = new Doctor(connection);
            while(true){
                System.out.println("HOSPITAL MANAGEMENT SYSTEM");
                System.out.println("1. Add Patient");
                System.out.println("2. View Patient ");
                System.out.println("3. View Doctor");
                System.out.println("4 Book Appointment");
                System.out.println("5.Exi");
                System.out.println("Enter your choice");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        // Add Patient
                        Patient.addPatient();
                        System.out.println();
                        break;
                    case 2:
                        // View Patient
                        Patient.viewPatient();
                        System.out.println();
                        break;

                    case 3:
                        //View Doctors
                        doctor.viewDoctors();
                        System.out.println();
                        break;
                     case 4:
//                         Book Appointment
                         bookAppointment(patient,doctor,connection,scanner);
                         System.out.println();
                         break;

                    case 5:
                        System.out.println("Thank you for using Hospital management system !!!!");
                        return;
                    default:
                        System.out.println("Invalid choice");

                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }



    public  static  void bookAppointment(Patient patient,Doctor doctor,Connection connection,Scanner scanner){
        System.out.println("Enter Patient ID");
        int patientID = scanner.nextInt();
        System.out.println("Enter Doctor ID");
        int doctorID = scanner.nextInt();
        System.out.println("Enetr Appointment Date (YYYY-MM-DD)");
        String appointDate = scanner.next();

        if(patient.getPatiendById(patientID) && doctor.getDoctorById(doctorID)){
            if(checkDoctorAvalibality(doctorID,appointDate,connection)){
                String appojntmentQuery = "INSERT INTO appointments(patient_id,doctor_id,appointment_date) VALUES(?,?,?)";
                try{
                    PreparedStatement preparedStatement = connection.prepareStatement(appojntmentQuery);
                    preparedStatement.setInt(1,patientID);
                    preparedStatement.setInt(2,doctorID);
                    preparedStatement.setString(3,appointDate);
                    int affectedRows = preparedStatement.executeUpdate();
                    if(affectedRows > 0){
                        System.out.println("Appointment has been booked successfully");
                    }else{
                        System.out.println("Fill the Appintment from");
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }else{
                System.out.println("Doctor Not Available");
            }
        }else{
            System.out.println("Enter Doctor or patient does not exist ");
        }
    }

    private static boolean checkDoctorAvalibality(int doctorID, String appointDate,Connection connection) {
        String query = "SELECT COUNT(*) FROM appointments WHERE doctor_id=? AND appointment_date=?";

        try{
          PreparedStatement preparedStatement = connection.prepareStatement(query);
          preparedStatement.setInt(1,doctorID);
          preparedStatement.setString(2,appointDate);
          ResultSet resultSet = preparedStatement.executeQuery();
          if(resultSet.next()){
              int count = resultSet.getInt(1);
              if(count==0){
                  return true;
              }else {
                  return false;
              }
          }
      }catch(SQLException e){
          e.printStackTrace();
      }
    return false;
    }
}
