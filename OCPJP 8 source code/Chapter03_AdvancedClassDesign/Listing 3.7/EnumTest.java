/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

enum PrinterType {
    DOTMATRIX(5), INKJET(10), LASER(50);
	
    private int pagePrintCapacity;

    private PrinterType(int pagePrintCapacity) {
	this.pagePrintCapacity = pagePrintCapacity;
    }	

    public int getPrintPageCapacity() {
	return pagePrintCapacity;
    }
}

public class EnumTest {
    PrinterType printerType;

    public EnumTest(PrinterType pType) {
	printerType = pType;
    }

    public void feature() {
	switch (printerType) {
	case DOTMATRIX:
		System.out.println("Dot-matrix printers are economical");
		break;
	case INKJET:
		System.out.println("Inkjet printers provide decent quality prints");
		break;
	case LASER:
		System.out.println("Laser printers provide the best quality prints");
		break;
	}
	System.out.println("Print page capacity per minute: " + 
			printerType.getPrintPageCapacity());
    }

    public static void main(String[] args) {
	EnumTest enumTest1 = new EnumTest(PrinterType.LASER);
	enumTest1.feature();
	EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
	enumTest2.feature();
    }
}
