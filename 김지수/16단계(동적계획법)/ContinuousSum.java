import java.util.Scanner;

public class ContinuousSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		int[] dp = new int[N];
		int max;
		
		sc.nextLine(); // nextInt 사용 후 nextLine 사용시 나타나는 문제점 해결
		String str[] = sc.nextLine().split(" ");
		
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		dp[0] = arr[0]; // 첫번째 원소부터 시작
		max = arr[0];
		
		for(int i = 1; i< N; i++) {
			dp[i] = Math.max(dp[i-1] + arr[i], arr[i]); // 이전값과 현재값 더한값 , 현재값 중 큰 값
			
			max = Math.max(max, dp[i]); // 현재까지 저장된 max값과 dp[i]값중 큰 값
		}
		System.out.println(max);
		
		sc.close();
	}

}
