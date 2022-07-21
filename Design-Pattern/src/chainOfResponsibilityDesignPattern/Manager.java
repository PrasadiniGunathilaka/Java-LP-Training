package chainOfResponsibilityDesignPattern;

public class Manager extends LoanApprover{

	@Override
	public String approveLoan(Loan loan) {
		
		if(loan.getAmount() >= 0.00 && loan.getAmount() <= 500000.00) {
			return "the loan is approve from the  Manager";

		}else {
			return successor.approveLoan(loan);
		}
	}	

}
