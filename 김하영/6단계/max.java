package Step6;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Arr[] = new int[9];
		int max = 0;
		int index = 0;
		
		for (int i = 0; i<9; i++) {
			Arr[i] = scanner.nextInt();
			
			if (Arr[i] > max) {
				max = Arr[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
		
	}

}
