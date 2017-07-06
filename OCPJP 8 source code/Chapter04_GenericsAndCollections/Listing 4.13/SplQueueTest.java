/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// This program shows the usage of Deque interface

import java.util.ArrayDeque;
import java.util.Deque;

class SplQueue {
    private Deque<String> splQ = new ArrayDeque<>();
    void addInQueue(String customer){
        splQ.addLast(customer);
    }
	
    void removeFront(){
        splQ.removeFirst();
    }

    void removeBack(){
	splQ.removeLast();
    }

    void printQueue(){
	System.out.println("Special queue contains: " + splQ);
    }
}

class SplQueueTest {
    public static void main(String []args) {
        SplQueue splQ = new SplQueue();
        splQ.addInQueue("Harrison");
    	splQ.addInQueue("McCartney");
    	splQ.addInQueue("Starr");
    	splQ.addInQueue("Lennon");
		
    	splQ.printQueue();
    	splQ.removeFront();
    	splQ.removeBack();
    	splQ.printQueue();
    }
}
