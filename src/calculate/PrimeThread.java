package calculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeThread extends Thread {

	boolean isprime = true;
	boolean running = true;
	int mini, maxi;

	public int getMini() {
		return mini;
	}

	public void setMini(int mini) {
		this.mini = mini;
	}

	public int getMaxi() {
		return maxi;
	}

	public void setMaxi(int maxi) {
		this.maxi = maxi;
	}

	public void run() {
		System.out.println("1");
		
		boolean complete = false;
		int count = getMini();
		double countd = getMini();
		int max = getMaxi();
		//System.out.println("Prime number generator");
		while (!complete) {
			if (!(count / 2 == countd / 2)) {
				for (int i = count - 1; i > 2; i--) {
					//System.out.println("danker                  " + count + "     " + count % i + "     " + countd / i);
					if ((count % i == 0)) {
						isprime = false;
					}
				}
			}
			if (isprime) {
				Threadrunner.prime.add(count);
				//System.out.println(count + " is prime");
			}
			count += 2;
			countd += 2;
			if (count > max) {
				complete = true;
			}
			isprime = true;
		}
		// System.out.println("run");
	}

	/*
	 * public static void PrimThread(int mini, int maxi) { int count = mini; double
	 * countd = mini; System.out.println("Prime number generator");
	 * Threadrunner.prime.add(2); while (!complete) { if (!(count / 2 == countd /
	 * 2)) { for (int i = count - 1; i > 2; i--) {
	 * System.out.println("danker                  " + count + "     " + count % i +
	 * "     " + countd / i); if ((count % i == 0)) { isprime = false; } } } if
	 * (isprime) { Threadrunner.prime.add(count); System.out.println(count +
	 * " is prime"); } count += 2; countd += 2; if (count > maxi) { complete = true;
	 * } isprime = true; } }
	 */
}
