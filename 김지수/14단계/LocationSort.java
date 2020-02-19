import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class LocationSort {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] listXY = new int[N][2];
		for(int i = 0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			listXY[i][0] = Integer.parseInt(s[0]);
			listXY[i][1] = Integer.parseInt(s[1]);
		}
		Arrays.sort(listXY, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1,int[] o2){
				if(o1[0] == o2[0]){
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		
		for(int i = 0; i<N; i++) {
			bw.write(listXY[i][0] + " " + listXY[i][1] + "\n");
		}
		
		br.close();
		bw.close();
	}
}