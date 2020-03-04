import java.util.Scanner;

public class Big {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] weight = new int[N];
		int[] height = new int[N];
		int[] count = new int[N];
		for(int i = 0; i<N; i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
		}
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				if(weight[i] < weight[j] && height[i] < height[j] && i != j)
				{
					count[i]++;
				}
			}
		}
		
		for(int i = 0; i<N; i++) {
			System.out.print(count[i] +1 + " ");
		}
	}

}
