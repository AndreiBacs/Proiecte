package g30126.bacs.andrei.l2.e5;

import java.util.Random;

public class E5 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] vect = new int[10];
		for (int i = 0; i < vect.length; i++) {
			vect[i] = r.nextInt(10);
			System.out.print(vect[i] + " ");
		}
		bubble(vect);
		System.out.println("");
		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}

	}

	static void bubble(int[] vect) {
		int n = vect.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (vect[j - 1] > vect[j]) {
					// swap the elements!
					temp = vect[j - 1];
					vect[j - 1] = vect[j];
					vect[j] = temp;
				}
			}
		}
	}

}
