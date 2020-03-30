import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		
		int[][] arr = new int[n+1][n+1];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i][j] = sc.nextInt();
				
				if(j == 1) { // 맨 왼쪽
					arr[i][j] = arr[i-1][j] + arr[i][j];
				}else if(i == j) { // 맨 오른쪽
					arr[i][j] = arr[i-1][j-1] + arr[i][j];
				}else { // 나머지
					// 현재 위치의 왼쪽 위, 오른쪽 위 값 중 큰 값을 넣는다.
					arr[i][j] = Math.max(arr[i-1][j-1], arr[i-1][j]) + arr[i][j];
					
				}

				max = Math.max(max, arr[i][j]);
			}
		}
		
		System.out.println(max);
	}

}
