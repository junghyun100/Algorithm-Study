import java.util.Scanner;

public class AboveAverage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 테스트케이스 개수
		int m, aboveAverage = 0;
		int[] scores;
		double average;
		for(int i = 0; i<n; i++){
			m = sc.nextInt(); // 사람 수
			scores = new int[m];
			aboveAverage = 0; // 평균값 넘는 인원수 초기화
			average = 0; // 평균값 초기화

			for(int j = 0; j<m; j++){
				scores[j] = sc.nextInt(); // 각 점수 입력
				average += scores[j];
			}
			average = average/m; // 평균값

			for(int j = 0; j<m; j++){
				if(scores[j] > average){
					aboveAverage++;
				}
			}
			System.out.println(String.format("%.3f",(double)aboveAverage/m*100) + "%");
		}
	}
}