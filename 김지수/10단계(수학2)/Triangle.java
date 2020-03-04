import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0)
				break;
			
			if(a>b){
				if(a>c) {
					IsRightTriangle(b, c, a);
				}
			}
			if(b>a) {
				if(b>c) {
					IsRightTriangle(a, c, b);
				}
			}
			if(c>a){
				if(c>b) {
					IsRightTriangle(a, b, c);
				}
			}
			
		}
	}
	public static void IsRightTriangle(int a, int b, int max) {
		if(a*a + b*b == max*max)
			System.out.println("right");
		else
			System.out.println("wrong");
	}
}
