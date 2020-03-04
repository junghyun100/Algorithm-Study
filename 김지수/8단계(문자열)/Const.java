import java.util.Scanner;

public class Const {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int max;
		String strA = Integer.toString(A);
		String strB = Integer.toString(B);
		
		strA = ""+strA.charAt(2) + strA.charAt(1) + strA.charAt(0);
		strB = ""+strB.charAt(2) + strB.charAt(1) + strB.charAt(0);
		
		A = Integer.parseInt(strA);
		B = Integer.parseInt(strB);
		
		if(A>B)
			max = A;
		else
			max = B;
		
		System.out.println(max);

	}

}
