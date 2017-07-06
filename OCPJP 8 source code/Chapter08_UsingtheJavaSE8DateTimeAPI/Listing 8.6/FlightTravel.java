/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlightTravel {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = 
                DateTimeFormatter.ofPattern("dd MMM yyyy hh.mm a");

        // Leaving on 1st Jan 2016, 6:00am from "Singapore"
        ZonedDateTime departure = ZonedDateTime.of(
                LocalDateTime.of(2016, Month.JANUARY, 1, 6, 0),
                ZoneId.of("Asia/Singapore"));

        System.out.println("Departure: " + dateTimeFormatter.format(departure));

        // Arrival on the same day in 10 hours in "Auckland"
        ZonedDateTime arrival =
                departure.withZoneSameInstant(ZoneId.of("Pacific/Auckland"))
                .plusHours(10);

        System.out.println("Arrival: " + dateTimeFormatter.format(arrival));
    }
}
