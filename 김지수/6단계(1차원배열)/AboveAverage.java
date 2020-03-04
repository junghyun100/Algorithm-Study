import java.util.Scanner;

public class AboveAverage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �׽�Ʈ���̽� ����
		int m, aboveAverage = 0;
		int[] scores;
		double average;
		for(int i = 0; i<n; i++){
			m = sc.nextInt(); // ��� ��
			scores = new int[m];
			aboveAverage = 0; // ��հ� �Ѵ� �ο��� �ʱ�ȭ
			average = 0; // ��հ� �ʱ�ȭ

			for(int j = 0; j<m; j++){
				scores[j] = sc.nextInt(); // �� ���� �Է�
				average += scores[j];
			}
			average = average/m; // ��հ�

			for(int j = 0; j<m; j++){
				if(scores[j] > average){
					aboveAverage++;
				}
			}
			System.out.println(String.format("%.3f",(double)aboveAverage/m*100) + "%");
		}
	}
}