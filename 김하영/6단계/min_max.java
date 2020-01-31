package Step6;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Arr[] = new int[N];
		int max = -1000000;
		int min = 1000000;
		
		for (int i = 0; i<N; i++) {
			Arr[i] = scanner.nextInt();
			
			if (Arr[i] > max) {
				max = Arr[i];
			}
			else if(Arr[i] < min) {
				min = Arr[i];
			}
		}
		
		System.out.println(min + " " + max);
		
	}

}
