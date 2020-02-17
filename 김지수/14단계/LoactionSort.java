import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LoactionSort {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] listX = new int[N];
		int[] listY = new int[N];
		for(int i = 0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			listX[i] = Integer.parseInt(s[0]);
			listY[i] = Integer.parseInt(s[1]);
		}
		
		BubbleSort(listX, listY, N);
		
		
		for(int i = 0; i<N; i++) {
			bw.write(listX[i] + " " + listY[i] + "\n");
		}
		
		br.close();
		bw.close();
	}
	public static void BubbleSort(int listX[], int listY[],int n) {
		for(int i = 0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				if(listX[i] > listX[j]) {
					int tempX = listX[i];
					listX[i] = listX[i+1];
					listX[i+1] = tempX; 
					int tempY = listY[i];
					listY[i] = listY[i+1];
					listY[i+1] = tempY;
				}
			}
		}
	}

}
