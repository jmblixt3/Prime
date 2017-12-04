package calculate;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static int count = 3;
	static double countd = 3;
	public static List<Integer> prime = new ArrayList<Integer>();
	static boolean complete = false;
	static boolean isprime = true;
	private final static int max = 100000;

	public static void main(String[] args) {
		System.out.println(Threadrunner.Home());
	}

	public static void PlusOne() {
		count= count+2;
		countd =count;
	}
}
