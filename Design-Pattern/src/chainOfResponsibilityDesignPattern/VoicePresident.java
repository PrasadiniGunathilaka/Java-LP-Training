package chainOfResponsibilityDesignPattern;

public class VoicePresident extends LoanApprover {
	
	
	@Override
	public String approveLoan(Loan loan) {
		
		if(loan.getAmount() > 500000.00 && loan.getAmount() <= 10000000.00) {
			return "the loan is approve from the  Voice President";

		}else {
			return successor.approveLoan(loan);
		}
	}

}
