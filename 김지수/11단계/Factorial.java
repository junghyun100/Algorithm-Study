import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		System.out.println(factorial(N));

		sc.close();
	}
	public static int factorial(int n) {
		if(n==1 || n==0){
			return 1;
		}
		else {
			return factorial(n-1) * n;
		}
	}

}
