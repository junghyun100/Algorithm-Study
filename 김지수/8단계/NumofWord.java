import java.util.Scanner;

public class NumofWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = 0;
		
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) == ' ') {
				n++;
			}
		}
		if(str.charAt(0) == ' ') {
			n--;
		}
		if(str.charAt(str.length()-1) == ' ') {
			n--;
		}
		System.out.println(n+1);
	}

}
