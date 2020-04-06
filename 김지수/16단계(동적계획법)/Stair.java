import java.util.Scanner;

public class Stair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long result = 0;
		long[][] arr = new long[N+1][10];
		
		for(int i = 1; i<10; i++) {
			arr[1][i] = 1; // 길이 1 일때
		}
		
		for(int i = 2; i<=N; i++) {
			for(int j = 0; j<10; j++) {
				if(j == 0) {
					arr[i][j] = arr[i-1][j+1];
				}else if(j == 9) {
					arr[i][j] = arr[i-1][j-1];
				}else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
				}
				arr[i][j] %= 1000000000;
			}
		}
		
		for(int i = 0; i<10; i++) {
			result += arr[N][i];
		}
		
		System.out.println(result%1000000000);
		
		sc.close();
	}

}
