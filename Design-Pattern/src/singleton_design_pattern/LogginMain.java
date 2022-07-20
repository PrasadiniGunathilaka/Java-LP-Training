package singleton_design_pattern;

public class LogginMain {
	
	    public static void main(String[] args) {
	        Loggin loggin = Loggin.getInstance();
	        Loggin loggin1 = Loggin.getInstance();

	        loggin.logginUser();
	        System.out.println(loggin);

	        loggin1.logginUser();
	        System.out.println(loggin1);
	    }
	}
