import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordSort{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();

		for(int i = 0; i<N; i++){
			String s = br.readLine();
			if(!list.contains(s)){
				list.add(s);
			}
		}

		Collections.sort(list, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){
				if(o1.length() - o2.length() == 0){
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		});

		for(int i = 0; i<list.size(); i++){
			bw.write(list.get(i) + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}	
}