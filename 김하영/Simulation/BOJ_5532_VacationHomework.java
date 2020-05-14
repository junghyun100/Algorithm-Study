package Simulation;

import java.util.Scanner;

public class BOJ_5532_VacationHomework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();

		int kor = A / C;
		if (A % C != 0) kor++; 
		int math = B / D;
		if (B % D != 0) math++;
		int result = (kor >= math) ? kor : math;

		System.out.println(L - result);
	}
}
