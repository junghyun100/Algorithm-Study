package Simulation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2161_Card1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		while(queue.size() != 1) {
			System.out.print(queue.poll() + " ");
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());
	}
}
