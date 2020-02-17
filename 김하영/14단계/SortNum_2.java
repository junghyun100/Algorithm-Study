package Step14;

import java.io.*;
import java.util.*;

public class SortNum_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		List list = new ArrayList();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			bw.write((int) list.get(i));
		}
	}
}
