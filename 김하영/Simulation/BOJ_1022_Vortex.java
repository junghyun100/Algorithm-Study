package Simulation;

import java.util.Scanner;

public class BOJ_1022_Vortex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 왼쪽 위 좌표 (c = x, r = y)
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		// 오른쪽 아래 좌표
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();

		// 입력 중 절대값이 큰 수의 제곱으로 배열을 생성
		int row = Math.max(Math.abs(r1), Math.abs(r2));
		int col = Math.max(Math.abs(c1), Math.abs(c2));
		int leng = Math.max(row, col) * 2 + 1;

		// 소용돌이를 담을 배열 생성
		int[][] arr = new int[leng][leng];
		int zero = leng / 2;
		arr[zero][zero] = 1;

		// 소용돌이를 채울 좌표
		int x = zero;
		int y = zero;
		int count = 2; // 소용돌이에 채워지는 숫자
		int times = 1; // 소용돌이 반복 횟수

		while (times != leng) {
			// 반복 횟수가 홀수면 오른/위, 반복 횟수가 짝수면 왼/아래
			if (times % 2 == 1) {
				for (int i = 0; i < times; i++) {
					x++; // 오른쪽
					arr[y][x] = count++;
				}
				for (int i = 0; i < times; i++) {
					y--; // 위
					arr[y][x] = count++;
				}
				times++;
			} else {
				for (int i = 0; i < times; i++) {
					x--; // 왼쪽
					arr[y][x] = count++;
				}
				for (int i = 0; i < times; i++) {
					y++; // 아래
					arr[y][x] = count++;
				}
				times++;
			}
		}
		// 소용돌이를 완성시키기 위해 다 돌고나면 맨 마지막에 times - 1 만큼 오른방향으로 소용돌이를 채워줍니다.
		for (int i = 0; i < times - 1; i++) {
			x++; // 오른쪽
			arr[y][x] = count++;
		}

		int printY = zero + r1;
		int printX = zero + c1;
		int max = 0;
		// 가장 큰 수 구하기
		for (int i = printY; i <= zero + r2; i++) {
			for (int j = printX; j <= zero + c2; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		int digitLength = (max + "").length(); // 가장 큰 수의 자릿수
		// 소용돌이 출력
		for (int i = printY; i <= zero + r2; i++) {
			for (int j = printX; j <= zero + c2; j++) {
				int tempLeng = (arr[i][j] + "").length();
				// 자리수에 맞게 공백 출력
				for (int k = digitLength - tempLeng; k > 0; k--) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j]); // 숫자 출력
				// 숫자 사이의 공백 출력
				if (j < zero + c2) {
					System.out.print(" ");
				}
			}
			// 마지막행을 제외한 행에 개행 추가
			if (i < zero + r2) {
				System.out.println();
			}
		}
	}
}
