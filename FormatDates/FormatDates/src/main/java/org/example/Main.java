package org.example;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        Date TodayDate = new Date();
            //09//05/2021
        String formattedDate1 = currentTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
          System.out.println("Format for 1: " + formattedDate1);
            //2023-10-20
        String formattedDate2 = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) ;
          System.out.println("Formatt for 2: " + formattedDate2);
            //September 5, 2021
        String formattedDate3 = currentTime.format(DateTimeFormatter.ofPattern("MMMM d, YYYY"));
            System.out.println("format for 3: " + formattedDate3);

        String formattedDate4 = currentTime.atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("EEEE, MMM d, YYY HH: mm"));
        System.out.println("formatted Date and GMT " + formattedDate4);
    }
}