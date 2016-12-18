/**
 * 
 */
package dchung.designpattern.builderpattern.notbestpractice;

/**
 * @author duy.chung
 * Explaination: Assume that initially we created BankAccount object with 5 params , however the new request might come, and require us to add more 
 * params in the near-future. That is ok but require developers need to create multiple constructors to deal with. OR you have to desing only one 
 * constructor with all neccessary params and depend on particulate case, we have to pass null value for un-use parameter, that's really ugly code.
 */
public class BankAccount {

	private long accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;

	public BankAccount(long accountNumber, String owner, String branch, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
