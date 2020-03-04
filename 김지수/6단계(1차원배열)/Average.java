import java.util.Scanner;

public class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = 0;
		double average = 0;
		int n = sc.nextInt(); // 과목 개수 입력받기
		int[] scores = new int[n];

		for(int i = 0; i<n; i++){
			scores[i] = sc.nextInt(); // 점수 입력받기
			if(max<scores[i]) // 최대값 구하기
				max = scores[i];
		}
		for(int i = 0; i<n; i++){
			average = average + ((double)scores[i]/max*100); // 점수 조작
		}
		average = average/n;
		System.out.println(average);
	}
}