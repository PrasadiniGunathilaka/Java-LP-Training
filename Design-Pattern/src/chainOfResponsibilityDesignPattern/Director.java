package chainOfResponsibilityDesignPattern;

public class Director extends LoanApprover {
		
		@Override
		public String approveLoan(Loan loan) {
			
			if(loan.getAmount() >= 5000000.00) {
				return "the loan is approve from the  Derector";

			}else {
				return successor.approveLoan(loan);
			}
		}
		
	

}
