/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// define an enum for classifying printer types 
enum PrinterType {
    DOTMATRIX, INKJET, LASER
}

// test the enum now 
public class EnumTest {
    PrinterType printerType;

    public EnumTest(PrinterType pType) {
        printerType = pType;
    }
	
    public void feature() {
	// switch based on the printer type passed in the constructor 
	switch(printerType){
	case DOTMATRIX:
		System.out.println("Dot-matrix printers are economical and almost obsolete");
		break;
	case INKJET:
		System.out.println("Inkjet printers provide decent quality prints");
		break;
	case LASER:
		System.out.println("Laser printers provide best quality prints");
		break;
	}    
    }

    public static void main(String[] args) {
	EnumTest enumTest = new EnumTest(PrinterType.LASER);
	enumTest.feature();
    }
}
