/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Consonants {
	private static boolean removeVowels(int c) {
		switch(c) {
		case 'a': case 'e': case 'i': case 'o': case 'u': return true;
		}
		return false; 
	}
	public static void main(String []args) {
		"avada kedavra".chars()
			.filter(Consonants::removeVowels)
			.forEach(ch -> System.out.printf("%c", ch));
	}
}
