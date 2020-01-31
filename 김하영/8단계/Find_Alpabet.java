package Step8;

import java.util.Scanner;

public class Find_Alpabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		int[] alpabet = new int[26];

		for (int i = 0; i < 26; i++) {
			alpabet[i] = -1;
		}
		for (int i = 0; i < S.length(); i++) {
			int x = S.charAt(i) - 'a';
			if (alpabet[x] == -1) {
				alpabet[x] = i;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(alpabet[i] + " ");
		}
	}

}
