package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Coin {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int total = Integer.parseInt(s[1]);
		int[] change = new int[N];
		int count = 0;

		for(int i=0; i<N; i++) {
			change[i] = Integer.parseInt(br.readLine());
		}
		
		int i = 9;
		while(true) {
			if(total - change[i] >= 0) {
				total-=change[i];
				count++;
				if(total == 0)
					break;
			}else {
				i--;
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
		
		br.close();
		bw.close();
	}

}
