import java.util.Scanner;

public class PrimeNumber1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i<N; i++) {
			int n = sc.nextInt();
			cnt+= PrimeNumberCheck(n);
		}
		System.out.println(cnt);
	}
	public static int PrimeNumberCheck(int num) {
		if(num < 2) {
			return 0;
		}
		for(int i = 2; i<num; i++) {
			if(num%i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
