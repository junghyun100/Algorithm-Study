import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Sortinside{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		while(N != 0){
			list.add(N%10);
			N = N/10;
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i));
	}
}