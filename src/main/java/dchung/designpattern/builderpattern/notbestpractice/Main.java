/**
 * 
 */
package dchung.designpattern.builderpattern.notbestpractice;

/**
 * @author duy.chung
 *
 */
public class Main {
	
	public static void Main(String[] s) {
		
		// now we need to init 2 accounts, one is Jonh.Smith with full information, one is Derek.J with un-known branch to open account
		BankAccount one = new BankAccount("12345", "John Smith", "VCB", 100.0, 0.5);
		BankAccount second = new BankAccount("78935", "Derek.J", null, 107.77, 0.56); // code receive null param, which is OK but ugly
		
		// assume if we don't know 3 last params yet, we have to create BankAccount as below:
		BankAccount third = new BankAccount("70935", "Duy", null, null, null); // so ugly code !!!
		
		// you can imagine that now if requirement wants to add phone number, cell phone number, address of that account ???, you might define
		// constructor or add new params in existing constructor and the code might become so ugly....
		
	}
}
