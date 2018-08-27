package com.jave24hours;

public class Benchmark {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 60000;
		long index = 0;
		while (true) {
			double x = Math.sqrt(index);
			long now = System.currentTimeMillis();
			if (now > endTime) {
				break;
			}
			index++;
		}
		double indexlog = Math.log10(index);
		System.out.println(indexlog + " loops in one minute.");
	}

}
