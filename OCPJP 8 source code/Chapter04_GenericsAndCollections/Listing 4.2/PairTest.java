/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// It demonstrates the usage of generics in defining classes
class Pair<T1, T2> {
    T1 object1;
    T2 object2;
    Pair(T1 one, T2 two) {
            object1 = one;
            object2 = two;
    }
    public T1 getFirst() {
            return object1;   
    }    
    public T2 getSecond() {
            return object2;   
    }    
}
 
class PairTest {
    public static void main(String []args) {
        Pair<Integer, String> worldCup = new Pair<Integer, String>(2018, "Russia");
        System.out.println("World cup " +  worldCup.getFirst() + 
		       " in " + worldCup.getSecond());
    }    
}
