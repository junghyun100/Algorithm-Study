import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = -1;
		
		if(N%3 == 0) {
			count = N/3;
		}
		for(int i = N; i> 0; i--) {
			if(i%3 == 0 && i%5 == 0) {
				count = i/5;
				N = N-i;
				
				if(N%3 == 0) {
					count += N/3;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
