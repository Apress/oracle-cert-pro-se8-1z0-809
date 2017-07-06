/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.List;
import java.util.Arrays;

class ArrayAsList {
    public static void main(String []args) {
        Double [] temperatureArray = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};
        System.out.println("The original array is: " + 
	Arrays.toString(temperatureArray));
        List<Double> temperatureList = Arrays.asList(temperatureArray);
  temperatureList.set(0, 35.2);
        System.out.println("The modified array is: " + 
        Arrays.toString(temperatureArray));
    }
}
