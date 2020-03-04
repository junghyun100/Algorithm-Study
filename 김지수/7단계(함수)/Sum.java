import java.util.Scanner;

public class Sum{
	public static long sum(int[] a){
		long sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++){
			a[i] = sc.nextInt();
		}
		System.out.println(sum(a));
	}
}