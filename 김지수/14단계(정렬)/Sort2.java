import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Sort2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);
		// Collections.sort 시간복잡도 = O(n*log(n))
		for(int i = 0; i<N; i++) {
			System.out.println(list.get(i));
		}
	}

}
