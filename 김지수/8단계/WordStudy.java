import java.util.Scanner;
import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class WordStudy{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		String s = sc.next();
		int len = s.length();
		for(int i = 0; i< len; i++){
			map.put(s.charAt(i), 0);
		}
		for(int i = 0; i< len; i++){
			map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}

		Set set= map.entrySet();
		System.out.println(map.size());
		
		System.out.println("set values are " + set);
		
	}
}