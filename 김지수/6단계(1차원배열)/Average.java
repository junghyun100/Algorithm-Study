import java.util.Scanner;

public class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = 0;
		double average = 0;
		int n = sc.nextInt(); // ���� ���� �Է¹ޱ�
		int[] scores = new int[n];

		for(int i = 0; i<n; i++){
			scores[i] = sc.nextInt(); // ���� �Է¹ޱ�
			if(max<scores[i]) // �ִ밪 ���ϱ�
				max = scores[i];
		}
		for(int i = 0; i<n; i++){
			average = average + ((double)scores[i]/max*100); // ���� ����
		}
		average = average/n;
		System.out.println(average);
	}
}