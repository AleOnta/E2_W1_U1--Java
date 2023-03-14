package E2_W1_U1;

import java.util.Arrays;

public class SIM {
	private String telephone_n;
	private double credit;
	private String[][] lastCalls;
	
	public SIM(String t_n) {
	telephone_n = t_n;
	credit = 0;
	lastCalls = setLastCalls();
	}
	
	public static void getSimInfo(SIM sim) {
		System.out.print("Required SIM info: ");
		System.out.print("Tel: " + sim.telephone_n + ", ");
		System.out.print("Credit: "+ sim.credit + ", ");
		System.out.println(Arrays.deepToString(sim.lastCalls));
	}
	
	private String[][] setLastCalls(){
		lastCalls = new String[5][2];
		for (int i = 0; i < lastCalls.length; i++) {
			lastCalls[i] = new String[] {"none", "00:00"};
		}
		return lastCalls;
	}
}
