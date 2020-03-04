import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.ArrayList;

public class Statistics{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		double sum = 0;
		int[] maxArr = new int[8001];
		int max = 0;
		int count = 0;

		for(int i = 0; i<N; i++){
			list.add(Integer.parseInt(br.readLine()));	//숫자입력받기
			sum += list.get(i); // 평균값 구하기 위한 합
		}

		Collections.sort(list);	// 오름차순 정렬메소드
		int second = 0;
		for(int i = 0; i< N; i++){
			maxArr[list.get(i) + 4000]++; // 해당되는 숫자 카운트 세기
			if(max <maxArr[list.get(i) + 4000]){
				max = maxArr[list.get(i) + 4000]; // 빈도수 max값 구하기
			}
		} //

		for(int i = 0; i< maxArr.length; i++){
			if(maxArr[i] == max){ // 빈도수 첫번째 max
				second = i-4000;
				count++;
			}
			if(count == 2){ // 빈도수 두번째 max
				break;
			}
		}

		bw.write((int)Math.round(sum/N) + "\n");
		bw.write(list.get(N/2) + "\n");
		bw.write(second + "\n");
		bw.write(list.get(N-1) - list.get(0) + "\n");
		br.close();
		bw.close();
	}
}