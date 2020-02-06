import java.util.Scanner;

public class BreakEvenPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		int breakEvenPoint;
		
		int i = 1;
		while(true) {
			if(C<=B) {
				breakEvenPoint = -1;
				break;
			}
			if(A + (B*i) < C*i) {
				breakEvenPoint = i;
				break;
			}
			i++;
		}
		System.out.println(breakEvenPoint);
	}

}
