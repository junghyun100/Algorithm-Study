package Step13;

import java.util.ArrayList;
import java.util.Scanner;

public class FilmDirector {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int num = 0;
		int index = 0;
		String str = "";
		int[] intArr = new int[N];

		while (index != N) {
			num += 1;
			str = Integer.toString(num);	// 정수형을 문자열로 변환
			if (str.contains("666")) {		// 문자열에 "666"이 포함되어 있으면 intArr에 추가
				intArr[index] = Integer.parseInt(str);	// 문자열을 정수형으로 변환
				index++;
			}

		}
		System.out.println(intArr[N - 1]);
	}
}
