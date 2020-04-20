package 그리디알고리즘;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		int change = 1000-money;
		int count = 0;
		int[] coin = {500,100,50,10,5,1};

		for(int i =0; i<coin.length; i++) {
			count += (change / coin[i]);
			change %= coin[i];
		}

		System.out.println(count);


		sc.close();
	}

}
