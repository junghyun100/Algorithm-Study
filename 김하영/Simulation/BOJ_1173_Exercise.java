package Simulation;

import java.util.Scanner;

public class BOJ_1173_Exercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 운동 시간
		int m = sc.nextInt();	// 최소 맥박
		int M = sc.nextInt();	// 최대 맥박
		int T = sc.nextInt();	// 운동
		int R = sc.nextInt();	// 휴식
		
		int pulse = m;
		int exercise = 0;
		int rest = 0;
		
		while(exercise != N) {
			if(pulse + T <= M) {
				exercise++;
				pulse += T;
			} else {
				rest++;
				if(pulse - R < m) {
					pulse = m;
				} else {
					pulse -= R;
				}
			}
			if(pulse + T > M && pulse == m) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(exercise + rest);
	}


}
