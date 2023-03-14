package E2_W1_U1;

import java.util.Arrays;

public class SIM {
	private String telephone_n;
	private double credit;
	private Call[] lastCalls = new Call[5];
	//private String[][] lastCalls;
	
	public SIM(String t_n) {
	telephone_n = t_n;
	credit = 0;
	lastCalls = setStartCalls();
	}
	
	public static void getSimInfo(SIM sim) {
		System.out.print("Required SIM info: ");
		System.out.print("Tel: " + sim.telephone_n + ", ");
		System.out.println("Credit: "+ sim.credit + ", ");
		for (int i = 0; i < sim.lastCalls.length; i++) {
			System.out.println("Call-"+ i + ": " + sim.lastCalls[i].showCall());
		}
	}
	
	public void startCall() {
		System.out.print("Insert number to call:");
		long number = myMainEx.myScan.nextLong();
		System.out.print("Insert call duration:");
		double duration = myMainEx.myScan.nextDouble();
		Call c = new Call(number, duration);
	}
	
	private Call[] setStartCalls() {
		for (int i = 0; i < lastCalls.length; i++) {
			lastCalls[i] = new Call(0l, 0d);
		}
		return lastCalls;
	}
}
