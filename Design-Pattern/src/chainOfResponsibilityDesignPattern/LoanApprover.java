package chainOfResponsibilityDesignPattern;

public abstract class LoanApprover {
	
	protected LoanApprover successor;

	public void setSuccessor(LoanApprover successor) {
		this.successor = successor;
	}
	
	
	public abstract String approveLoan(Loan loan);

}
