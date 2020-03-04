import java.util.Scanner;

public class FindAlphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int first;
		for(char i = 'a'; i<='z'; i++){
			first = -1;
			for(int j = 0; j<s.length(); j++){
				if(i == s.charAt(j)){
					first = j;
					break;
				}
			}
			System.out.println(first);
		}
	}
}