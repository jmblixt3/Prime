package calculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.SeparatorUI;

public class Threadrunner {

	static int count = 3;
	static double countd = 3;
	public static List<Integer> prime = new ArrayList<Integer>();
	static boolean complete = false;
	static boolean isprime = true;
	private final static int min = 3;
	private final static int max = 1000003 + 1;
	private final static int threadnum = 10;

	public static String Home() {

		int threadSize = (max - min) / threadnum;
		Threadrunner.prime.add(2);
		PrimeThread[] thread = new PrimeThread[threadnum];
		// int i = 1;
		for (int i = 1; i < threadnum; i++) {
			//System.out.println("start " + i + " min " + (min + (i - 1) * threadSize) + " max " + i * threadSize);
			thread[i - 1] = new PrimeThread();
			thread[i - 1].setMini(min + (i - 1) * threadSize);
			thread[i - 1].setMaxi(i * threadSize);
			thread[i - 1].run();
		}
		/*
		 * for(int i = 1; i<threadnum;i++) { System.out.println();
		 * threads[i].run(((i-1)*threadSize),i*threadSize); }
		 */

		// new Thread(PrimeThread.Primes((i-1)*threadSize,i*threadSize)).start();

		System.out.println(Arrays.toString(prime.toArray()));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Arrays.toString(prime.toArray());
	}

}
