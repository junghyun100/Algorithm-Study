import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int num[] = new int[N];
		int sum = 0;
		int max = 0;
		for(int i = 0; i <N; i++) {
			num[i] = sc.nextInt();
		}
		
		loop:
		for(int i = 0; i< N-2; i++) {
			for(int j = i+1; j< N-1; j++) {
				for(int k = j+1; k<N; k++) {
					sum = num[i] + num[j] + num[k];
					if(sum <= M)
						if(max<sum)
							max = sum;
					if(max == M)
						break loop;
				}
			}
		}
		System.out.println(max);
	}

}
