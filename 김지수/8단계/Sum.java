import java.util.Scanner;

public class Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		char[] charArr = new char[n];
		String str = sc.next();
		for(int i = 0; i<n; i++){
			if( i < str.length()){
				charArr[i] = str.charAt(i);
				sum+= charArr[i] - 48;
			}
		}
		System.out.println(sum);
	}
}