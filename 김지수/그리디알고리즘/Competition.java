package 그리디알고리즘;

import java.util.Scanner;

public class Competition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		for(int i = 0; i < K; i++) {
			if(N/2 >= M) {
				N--;
			}else {
				M--;
			}
		}

		if(N/2 >= M) {
			System.out.println(M);
		}else {
			System.out.println(N/2);
		}


		sc.close();
	}

}
