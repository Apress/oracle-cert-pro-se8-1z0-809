/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.time.temporal.ChronoUnit;

public class ChronoUnitValues {
    public static void main(String []args) {
        System.out.println("ChronoUnit DateBased TimeBased Duration");
        System.out.println("---------------------------------------");
        for(ChronoUnit unit : ChronoUnit.values()) {
            System.out.printf("%10s \t %b \t\t %b \t\t %s %n",
                        unit, unit.isDateBased(), unit.isTimeBased(), unit.getDuration());
        }
    }
}
