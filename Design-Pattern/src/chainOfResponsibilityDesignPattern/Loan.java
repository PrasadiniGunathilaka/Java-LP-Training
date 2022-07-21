package chainOfResponsibilityDesignPattern;

public class Loan {
	
	private int loanNum;
	private double amount;
	
	public Loan(double amount, int loanNum) {
		this.loanNum = loanNum;
		this.amount = amount;	
	}

	public int getLoanNum() {
		return loanNum;
	}

	public void setLoanNum(int loanNum) {
		this.loanNum = loanNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}