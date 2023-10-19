package org.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        try {
            BufferedReader bufferRead = new BufferedReader(new FileReader("employees.csv"));
            String line = null;
            bufferRead.readLine();

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

            for (Employee employee : employees) {
              double grossPay = employee.getGrossPay();
            // System.out.println("The employee:" + employee.getEmployeeID() + "| Name: " + employee.getName() + "| GrossPay:" + grossPay);
              System.out.printf("\nemployeeId:%d,\nemployeeName:%s,\nemployeePay.%.2f\n", employee.getEmployeeID(),employee.getName(),employee.getGrossPay());
            }

        } catch (Exception e) {

        }

    }
}