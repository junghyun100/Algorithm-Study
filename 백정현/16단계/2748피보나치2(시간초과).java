import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int answer = 0;
		answer = fibonach(N);
		System.out.println(answer);
	}
	private static int fibonach(int index)
	{
		if(index == 0) return 0;
		else if(index == 1) return 1;
		else return fibonach(index-2)+ fibonach(index-1);
		
	}
}