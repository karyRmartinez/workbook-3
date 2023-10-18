package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of story:");

        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            int lineNum = 1;

            if (fileScanner.hasNextLine()) {

                String lineScanner = fileScanner.nextLine();

                System.out.println(lineScanner + ". " + lineNum);
                lineNum ++;

                while (fileScanner.hasNextLine()) {
                    lineScanner = fileScanner.nextLine();
                    System.out.println(lineNum + ". " + lineScanner);
                    lineNum++;
                }
                fileScanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error" + fileName);
        }
    }
}