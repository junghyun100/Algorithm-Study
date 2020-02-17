import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class CountingSort{
    public static void main(String arg[]) throws Exception
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

	    int[] cnt = new int[10001];

        for (int i = 0; i < N; i++){
	        int num = Integer.parseInt(br.readLine());
            cnt[num]++;
        }

		for(int i = 1; i< 10001; i++){
	    	for(int j = 0; j<cnt[i]; j++){
				bw.write(i + "\n");
	  	 	}
		}
		br.close();
		bw.close();
	}
}