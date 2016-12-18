/**
 * 
 */
package dchung.designpattern.builderpattern.notbestpractice;

/**
 * @author duy.chung
 * Explaination: Assume that initially we created BankAccount object with 5 params , however the new request might come, and require us to add more 
 * params in the near-future. That is ok but require developers need to create multiple constructors to deal with. OR you have to desing only one 
 * constructor with all neccessary params and depend on particulate case, we have to pass null value for un-use parameter, that's really ugly code.
 * Please see dchung.designpattern.builderpattern.notbestpratice.Main.java to see why we should avoid this.
 */
public class BankAccount {

	private String accountNumber;
	private String owner;
	private String branch;
	private Double balance;
	private Double interestRate;

	public BankAccount(String accountNumber, String owner, String branch, Double balance, Double interestRate) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

}
