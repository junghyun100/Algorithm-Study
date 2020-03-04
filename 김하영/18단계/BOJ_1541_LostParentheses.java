import java.util.Scanner;

public class BOJ_1541_LostParentheses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] minusArr = str.split("\\-");
		int result = 0;
		
		for(int i = 0; i<minusArr.length; i++) {
			 String[] plusArr = minusArr[i].split("\\+");
			 int sum = 0;
			 
			 for(int j = 0; j<plusArr.length; j++) {
				 sum += Integer.parseInt(plusArr[j]);
			 }
			 if(i == 0) {
				 result += sum;
			 } else {
			 result -= sum;
			 }
		}
		System.out.println(result);
		scanner.close();
	}
}
