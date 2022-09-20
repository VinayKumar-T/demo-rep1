package com.te.learnjava8.basic;

class MaxMinHold {
	int min = 0;
	int max = 0;
}

public class MinMax {

	public static MaxMinHold m1(int[] a) {
		int max = Integer.MIN_VALUE;// max=a[0]
		int min = Integer.MAX_VALUE;// min=a[0]
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {

				max = a[i];

			} else if (a[i] < min) {
				min = a[i];
			}

		}
		max=a[1];
		
		MaxMinHold hold = new MaxMinHold();
		hold.min = min;
		hold.max = max;
		return hold;
	}

	public static void main(String[] args) {
		int a[] = { 1, -4, 2, 5, -6 };
		MaxMinHold output = m1(a);
		System.out.println(output.min);
		System.out.println(output.max);

	}
}
