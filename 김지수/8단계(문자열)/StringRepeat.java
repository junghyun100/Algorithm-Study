import java.util.Scanner;

public class StringRepeat{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int repeat; 
		String s; 
		String p; 

		int n = sc.nextInt();
		for(int i  = 0; i< n; i++){
			p = "";
			repeat = sc.nextInt(); 
			s = sc.next();
			for(int j = 0; j<s.length(); j++){
				for(int k = 0; k<repeat; k++){
					p += s.charAt(j);
				}
			}
			System.out.println(p);
		}
	}
}