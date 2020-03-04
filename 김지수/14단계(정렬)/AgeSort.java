import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class AgeSort{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[][] member = new String[N][2];
		for(int i = 0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			member[i][0] = s[0];
			member[i][1] = s[1];
		}
		Arrays.sort(member, new Comparator<String[]>(){
			@Override
			public int compare(String[] o1,String[] o2){
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		
		for(int i = 0; i<N; i++) {
			bw.write(member[i][0] + " " + member[i][1] + "\n");
		}
		
		br.close();
		bw.close();
	}
}