package onedimensionalarrays;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] new_integers;
		System.out.println("Enter array size: ");
		int x = scanner.nextInt();
		
		new_integers = new int[x];
		
		for (int i = 0; i < x; i++) {
			new_integers[i] = i;
			System.out.println("Index " + i + " is equal to " + new_integers[i]);
		}
		
	}
	
}
