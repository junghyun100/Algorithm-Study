package 시뮬레이션;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		
		java.lang.String A = sc.next();
		java.lang.String B = sc.next();
		
		int size = B.length() - A.length();
		int min = Integer.MAX_VALUE;
		
		// 개수 차이만큼 반복
		for(int i = 0; i <= size; i++ ) {
			int cnt = 0;
			for(int j = 0; j < A.length(); j++) {	
				if(A.charAt(j) != B.charAt(i+j)) { // 차이 체크
					cnt++;
				}
			}
			if(cnt < min ) {
				min = cnt;
			}
			
		}
		
		System.out.println(min);
		
		sc.close();
	}
}

/*
 * 두 문자열 A와 B가 주어진다. 이때, A의 길이는 B의 길이보다 작거나 같다. 
 * 이제 A의 길이가 B의 길이와 같아질 때 까지 다음과 같은 연산을 할 수 있다.
 * A의 앞에 아무 알파벳이나 추가한다.
 * A의 뒤에 아무 알파벳이나 추가한다.
 * 이때, A와 B의 길이가 같으면서, A와 B의 차이를 최소로 하는 프로그램을 작성하시오.
 * 
 * 차이를 최소로 하기 때문에 A의 앞 이나 뒤에 B와 같은 알파벳을 입력받을 것임.
 * 따라서 뒤에 받는건 체크 안해도 됨
 */
