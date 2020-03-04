import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, w, h;
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		
		int row = w - x;
		int column = h - y;
		
		int min = Math.min(x, row);
		min = Math.min(min, column);
		min = Math.min(min, y);
		
		System.out.println(min);
	}
}
