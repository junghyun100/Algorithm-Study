import java.util.Scanner;

public class Tile {
	static long[] count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	
		count = new long[N];

		count[0] = 1;
		count[1] = 2;
		
		for(int i = 2; i <N; i++) {
			count[i] = (count[i-2] + count[i-1]) % 15746;
		}
		System.out.println(count[N-1]);
		
		sc.close();
	}
}
