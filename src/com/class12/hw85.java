package com.class12;

public class hw85 {
	public static void main(String[] args) {
		int[][] a = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		// should be true

		boolean square = false;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i] == a[j]) {
					square=true;
					continue;

				}

			}
			System.out.println(square);

		}

	}

}
