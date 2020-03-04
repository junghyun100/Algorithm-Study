import java.util.Scanner;

public class GroupWordChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		boolean checker;
		
		for(int i = 0; i <n; i++) {		
			String word = sc.next();
			checker = true;
			
			for(int j = 0; j<word.length(); j++) {
				for(int k = 0; k<j; k++) {
					if(word.charAt(j) != word.charAt(j-1) && word.charAt(j) == word.charAt(k)) {
						checker = false;
						break;
					}
				}
			}
			if(checker) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
