/**
 * 
 */
package dchung.designpattern.builderpattern.bestpractice;

/**
 * @author duy.chung
 *
 */
public class BankAccount {

	private String accountNumber; 
    private String owner;
    private String branch;
    private Double balance;
    private Double interestRate;
	
	private BankAccount() {}
	
    public static class Builder {
    	
        private String accountNumber; 
        private String owner;
        private String branch;
        private Double balance;
        private Double interestRate;
        
        public Builder(String accountNumber) {
            this.accountNumber = accountNumber;
        }
        
        public Builder withOwner(String owner){
            this.owner = owner;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        
        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        
        public Builder openingBalance(Double balance){
            this.balance = balance;
            return this;
        }
        
        public Builder atRate(Double interestRate){
            this.interestRate = interestRate;
            return this;
        }
        
        public BankAccount build(){
            BankAccount account = new BankAccount();  
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
        
    }

    // now we just need getter only
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public String getBranch() {
		return branch;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getInterestRate() {
		return interestRate;
	}
    
}
