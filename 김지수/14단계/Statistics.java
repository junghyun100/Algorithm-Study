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
			list.add(Integer.parseInt(br.readLine()));	
			sum += list.get(i);
		}

		Collections.sort(list);	
		int second = 0;
		for(int i = 0; i< N; i++){
			maxArr[list.get(i) + 4000]++;
			if(max <maxArr[list.get(i) + 4000]){
				max = maxArr[list.get(i) + 4000];
			}
		}

		for(int i = 0; i< maxArr.length; i++){
			if(maxArr[i] == max){
				count++;
				second = i-4000;
			}
			if(count == 2){
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