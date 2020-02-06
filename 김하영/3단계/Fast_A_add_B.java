package Step3;

import java.io.*;

public class Fast_A_add_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String[] word = br.readLine().split(" ");
			bw.write((Integer.parseInt(word[0]) + Integer.parseInt(word[1])) + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
