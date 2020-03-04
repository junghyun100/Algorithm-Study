import java.util.Scanner;

public class PrimeNumber2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = 0;
		boolean isFirst = true;
		
		for(int i = M; i<=N; i++){
			boolean isPrime = true;
			for(int j = 2; j<i; j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime  && i > 1){
				sum+= i;
				if(isFirst){
					min = i;
					isFirst = false;
				}
			}
		}
		if(sum == 0){
			System.out.println(-1);
		}
		else{
			System.out.println(sum);
			System.out.println(min);
		}		
	}
}