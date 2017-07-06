/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

public class EnumTest {
    PrinterType printerType;

    enum PrinterType {INKJET, DOTMATRIX, LASER};
    public EnumTest(PrinterType pType) {
        printerType = pType;
    }

    public static void main(String[] args) {
        PrinterType pType = new PrinterType();
        EnumTest enumTest = new EnumTest(PrinterType.LASER);
    }
}
