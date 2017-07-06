/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// Here is how we can create Point3D class by extending Point2D class
public class Point3D extends Point2D {
        private int zPos;
         
         // provide a public constructors that takes three arguments (x, y, and z values) 
         public Point3D(int x, int y, int z) {
                // call the superclass constructor with two arguments 
    		// i.e., call Point2D(int, int) from Point2D(int, int, int) constructor) 
    		super(x, y); // note that super is the first statement in the method 
        		zPos = z;
        }

         // override toString method as well 
    	public String toString() {
    		return super.toString() + ", z = " + zPos;
    	}
    	
         // to test if we extended correctly, call the toString method of a Point3D object 
	public static void main(String []args) {
    		System.out.println(new Point3D(10, 20, 30));
        }
} 
