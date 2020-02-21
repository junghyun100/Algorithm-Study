import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Queen{
	int N
	int[] cols;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		cols = new int[N];

		BackTracking(0);

		br.close();
		bw.close();		
	}
	public static void BackTracking(int index){
		if(index == N){

		}else{
			for(int i = 0; i<N; i++){
				
			}
		}
	}
}