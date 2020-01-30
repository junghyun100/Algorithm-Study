import java.util.Scanner;

public class NumCount{
	public static void main(String[] args){
		int a,b,c;
		int[] numCount = new int[10];
		String result;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		result = Integer.toString(a*b*c);

		for(int i = 0; i<result.length(); i++){
			if(result.charAt(i) == '0')
				numCount[0]++;
			else if(result.charAt(i) == '1')
				numCount[1]++;
			else if(result.charAt(i) == '2')
				numCount[2]++;
			else if(result.charAt(i) == '3')
				numCount[3]++;
			else if(result.charAt(i) == '4')
				numCount[4]++;
			else if(result.charAt(i) == '5')
				numCount[5]++;
			else if(result.charAt(i) == '6')
				numCount[6]++;
			else if(result.charAt(i) == '7')
				numCount[7]++;
			else if(result.charAt(i) == '8')
				numCount[8]++;
			else if(result.charAt(i) == '9')
				numCount[9]++;
			else{}
		}
		for(int i = 0; i<10; i++){
			System.out.println(numCount[i]);
		}
	}
}