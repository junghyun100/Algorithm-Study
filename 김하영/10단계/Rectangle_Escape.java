package Step10;

import java.util.Scanner;

public class Rectangle_Escape {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		
		int a, b;

		if(x > w/2) {
			a = w - x;
		} else {
			a = x;
		}
		
		if(y > h/2) {
			b = h - y;
		} else {
			b = y;
		}
		
		System.out.println(a > b ? b : a);
		
	}

}
