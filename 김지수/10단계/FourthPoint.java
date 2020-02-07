import java.util.Scanner;

public class FourthPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1, x2, x3, y1, y2, y3, x4, y4;
		
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		
		if(x1 == x2) {
			x4 = x3;
		}
		else if(x1 == x3) {
			x4 = x2;
		}
		else {
			x4 = x1;
		}
		
		if(y1 == y2) {
			y4 = y3;
		}
		else if(y1 == y3) {
			y4 = y2;
		}
		else {
			y4 = y1;
		}
		
		System.out.println(x4 + " " + y4);

	}

}
