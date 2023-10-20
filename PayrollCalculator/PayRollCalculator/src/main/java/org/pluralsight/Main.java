package org.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        try {
            BufferedReader bufferRead = new BufferedReader(new FileReader("employees.csv"));
            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("outputFile"));

            System.out.print("Enter input file: ");
           //System.out.print("Enter file:");
            String fileName = scanner.nextLine();
           // BufferedWriter writer = null;
              String line = null;


           //System.out.println("Data has been written to the file.");

            while ((line = bufferRead.readLine()) != null) {

                String[] data = line.split("\\|");

                int employeeID = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                double hoursWorked = Double.parseDouble(data[2].trim());
                double payRate = Double.parseDouble(data[3].trim());

                Employee employee = new Employee(employeeID, name, hoursWorked, payRate);
                employees.add(employee);
            }
            bufferRead.close();

            System.out.print("Enter output file: ");
            String outputFile = scanner.nextLine();

            for (Employee employee : employees) {
              double grossPay = employee.getGrossPay();
                bufferWriter.write(employee.getEmployeeID() + employee.getName() + "|"+ String.format("%2f", grossPay));
                bufferWriter.newLine();;
               // bufferWriter.close();
            // System.out.println("The employee:" + employee.getEmployeeID() + "| Name: " + employee.getName() + "| GrossPay:" + grossPay);
              System.out.printf("\nemployeeId:%d,\nemployeeName:%s,\nemployeePay.%.2f\n", employee.getEmployeeID(),employee.getName(),employee.getGrossPay());
            }

        } catch (Exception e) {

        }

    }
}