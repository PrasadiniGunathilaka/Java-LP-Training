package singleton_design_pattern;

public class Loggin {

	    private static volatile Loggin loggin;

	    private Loggin() {
	        if (loggin != null) {
	            throw new RuntimeException("Use getInstance method");
	        }
	    }

	    public static Loggin getInstance() {
	        if (loggin == null) {
	            synchronized (Loggin.class) {
	                if (loggin == null) {
	                    loggin = new Loggin();
	                }
	            }
	        }

	        return loggin;
	    }

	    public void logginUser () {
	        System.out.println("Loggin successfully...");
	    }

}
	