import java.util.Scanner;

public class ContinuousSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		int[] dp = new int[N];
		int max;
		
		sc.nextLine(); // nextInt ��� �� nextLine ���� ��Ÿ���� ������ �ذ�
		String str[] = sc.nextLine().split(" ");
		
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		dp[0] = arr[0]; // ù��° ���Һ��� ����
		max = arr[0];
		
		for(int i = 1; i< N; i++) {
			dp[i] = Math.max(dp[i-1] + arr[i], arr[i]); // �������� ���簪 ���Ѱ� , ���簪 �� ū ��
			
			max = Math.max(max, dp[i]); // ������� ����� max���� dp[i]���� ū ��
		}
		System.out.println(max);
		
		sc.close();
	}

}
