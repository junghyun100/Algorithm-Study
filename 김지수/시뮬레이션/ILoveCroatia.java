package �ùķ��̼�;

import java.util.Scanner;

public class ILoveCroatia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int boom = sc.nextInt(); // ��ź�� ��� �ִ� ���
		int N = sc.nextInt(); // ���� ����
		sc.nextLine(); // nextInt�� nextLine���� ������ �ذ�
		int totalTime = 210; // �� �ð� 3�� 30�� 
		int currentTime = 0; // ���� �ð�
		
		for(int i = 0; i < N; i++) {
			String[] str = sc.nextLine().split(" ");
			int time = Integer.parseInt(str[0]);
			currentTime += time;
			if(totalTime <= currentTime) { // boom
				break;
			}

			while(!str[1].equals("T")) { // ������ �ƴ� ��
				String[] str2 = sc.nextLine().split(" "); // �ٽ� ������ �ް� ���
				int time2 = Integer.parseInt(str2[0]); // �ٽ� ���� �ð�
				currentTime += time2;
				if(currentTime >= totalTime || str2[1].equals("T")) // ��ź�� �����ų� ������ ������ �� break;
					break;
			}

			if(totalTime > currentTime) { // ��ź�� �������ٸ�
				boom++; // ����������� �ѱ�
				if(boom > 8) // 8��°�� 1��°�� �ѱ�
					boom = 1;
			}
			else { // ����N���� ���������� ��ź�� �����ٸ� break;
				break;
			}

		}
		
		System.out.println(boom);
		
		sc.close();
	}

}
