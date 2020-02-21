import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BackTrackingNM4{
		static int N;
		static int M;
		static int[] arr = new int[8];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);

		BackTracking(0, bw, 1);

		bw.close();
		br.close();
	}
	public static void BackTracking(int index, BufferedWriter bw, int min) throws Exception{
		if(index == M){
			for(int i = 0; i<M; i++){
				bw.write(arr[i] + " ");
			}
			bw.write("\n");
			return;
			
		} else{
			for(int i = min; i<=N; i++){
				arr[index] = i;
				BackTracking(index + 1, bw, i);
			}
		}
	}
}