package E2_W1_U1;

public class Call {
	
	long calledNumber;
	double temps;
	
	public Call() {
		System.out.println("Insert telephone number:");
		this.calledNumber = myMainEx.myScan.nextLong();
		System.out.println("Insert call duration:");
		this.temps = myMainEx.myScan.nextDouble();
	}
	
	public Call(long n, double d) {
		calledNumber = n;
		temps = d;
	}
	
	public String showCall() {
		return "Tel: " + calledNumber + ", duration: " + temps;
	}
}
