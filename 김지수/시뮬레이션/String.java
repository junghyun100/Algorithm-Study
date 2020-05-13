package �ùķ��̼�;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		
		java.lang.String A = sc.next();
		java.lang.String B = sc.next();
		
		int size = B.length() - A.length();
		int min = Integer.MAX_VALUE;
		
		// ���� ���̸�ŭ �ݺ�
		for(int i = 0; i <= size; i++ ) {
			int cnt = 0;
			for(int j = 0; j < A.length(); j++) {	
				if(A.charAt(j) != B.charAt(i+j)) { // ���� üũ
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
 * �� ���ڿ� A�� B�� �־�����. �̶�, A�� ���̴� B�� ���̺��� �۰ų� ����. 
 * ���� A�� ���̰� B�� ���̿� ������ �� ���� ������ ���� ������ �� �� �ִ�.
 * A�� �տ� �ƹ� ���ĺ��̳� �߰��Ѵ�.
 * A�� �ڿ� �ƹ� ���ĺ��̳� �߰��Ѵ�.
 * �̶�, A�� B�� ���̰� �����鼭, A�� B�� ���̸� �ּҷ� �ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ���̸� �ּҷ� �ϱ� ������ A�� �� �̳� �ڿ� B�� ���� ���ĺ��� �Է¹��� ����.
 * ���� �ڿ� �޴°� üũ ���ص� ��
 */
