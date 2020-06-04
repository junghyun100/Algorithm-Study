package �ùķ��̼�;

import java.util.Scanner;

public class RollCake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt(); // �� ����ũ�� ����
		int N = sc.nextInt(); // ��û���� ��
		
		int[] cake = new int[L];
		int sum;
		int max = 0, real = 0;
		int expect = 0, result = 0;
		
		for(int i = 1; i <= N; i++) {
			int P = sc.nextInt() -1;
			int K = sc.nextInt() -1;
			
			sum = K-P;
			if(sum > max) {
				max = sum; 
				expect = i; // ���� ���� ����ũ ������ ���� ������ ����� ��û���� ��ȣ
			}
			
			int count = 0;
			for(int j = P; j <= K; j++) {
				if(cake[j] != 0)
					continue;
				else {
					cake[j] = i;
					count++;
				}
			}
			
			if(real < count) {
				real = count;
				result = i;
			}
		}
		System.out.println(expect);
		System.out.println(result);
		
		sc.close();
	}

}
