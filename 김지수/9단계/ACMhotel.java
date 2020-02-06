import java.util.Scanner;

public class ACMhotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int floor;
		int number;
		for(int i = 0; i < len; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			number = N/H + 1;
			floor = N%H;
			if(N%H == 0) {
				floor = H;
			}
			if(floor == H) {
				number--;
			}
			if(number < 10)
				System.out.println(Integer.parseInt(floor + "0" + number));
			else
				System.out.println(Integer.parseInt(floor + "" + number));
		}
	}

}
