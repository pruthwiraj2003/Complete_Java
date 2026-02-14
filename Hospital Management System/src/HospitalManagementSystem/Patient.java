package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {
    private static Connection connection;
    private static Scanner scanner;
    public Patient(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public static void addPatient() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Patient Gender: ");
        String gender = scanner.nextLine();

        try {
            String query = "INSERT INTO patients (name, age, gender) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, gender);
            int affectedRows = preparedStatement.executeUpdate();
            if(affectedRows > 0) {
                System.out.println("Patient has been added successfully!");
            }else{
                System.out.println("Patient has been added failed!");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void viewPatient() {
        String query = "SELECT * FROM patients";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Patient : ");
            System.out.println("+----------+----------------------+------------------+----------------+");
            System.out.println("|Patient id| Name                 | Age              | Gender          |");
            System.out.println("+----------+----------------------+------------------+----------------+");
            while(resultSet.next()) {
                int id =resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                System.out.printf("|%-12s|%-20s|%-10s|%-12s|\n", id, name, age, gender);
                System.out.println("+----------+----------------------+------------------+----------------+");
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public boolean getPatiendById(int id) {
        String query = "SELECT * FROM patients WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return true;
            }else {
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }

}
