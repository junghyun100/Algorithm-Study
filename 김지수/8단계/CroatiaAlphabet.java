import java.util.Scanner;

public class CroatiaAlphabet {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		try {
			for(int i = 0; i<str.length(); i++) {
				if(str.charAt(i) == 'c') {
					if(str.charAt(i+1) == '-' || str.charAt(i+1) == '=') {
						count++;
						i++;
					}
					else {
						count++;
					}
				}
				else if(str.charAt(i) == 'd') {
					if(str.charAt(i+1) == '-') {
						count++;
						i++;
					}
					else if(str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {
						count++;
						i+=2;
					}
					else {
						count++;
					}
				}
				else if(str.charAt(i) == 'l' && str.charAt(i+1) == 'j') {
					count++;
					i++;
				}
				else if(str.charAt(i) == 'n' && str.charAt(i+1) == 'j') {
					count++;
					i++;
				}
				else if(str.charAt(i) == 's' && str.charAt(i+1) == '=') {
					count++;
					i++;
				}
				else if(str.charAt(i) == 'z' && str.charAt(i+1) == '=') {
					count++;
					i++;
				}
				else {
					count++;
				}
			}
		}catch(Exception e) {}
		
		System.out.println(count);
		sc.close();
	}

}
