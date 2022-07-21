package chainOfResponsibilityDesignPattern;

public class Application {
	
	public static void main(String args[]) {
		
		Manager manager = new Manager();
		VoicePresident voicePresident= new VoicePresident();
		Director director = new Director();
		
		
		director.setSuccessor(manager );
		manager.setSuccessor(director);
		
		
		Loan loan = new Loan(5000000.00, 5);
		System.out.println(manager.approveLoan(loan));
		
		Loan loan1 = new Loan(20000.00, 5);
		System.out.println(director.approveLoan(loan1));
		
		
		
	}

}
