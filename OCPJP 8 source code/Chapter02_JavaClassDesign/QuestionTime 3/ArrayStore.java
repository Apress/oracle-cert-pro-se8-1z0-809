/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Base {} 
class DeriOne extends Base {} 
class DeriTwo extends Base {}

class ArrayStore {
	public static void main(String []args) {
		Base [] baseArr = new DeriOne[3];
		baseArr[0] = new DeriOne();
		baseArr[2] = new DeriTwo();
		System.out.println(baseArr.length);
	}
}
