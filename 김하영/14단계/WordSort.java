package Step14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int N = Integer.parseInt(scanner.nextLine());

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < N; i++) {
			set.add(scanner.nextLine());
		}

		ArrayList<String> list = new ArrayList<String>(set);

		Collections.sort(list, new Comparator<String>() {
			public int compare(String str1, String str2) {
				if (str1.length() > str2.length()) {
					return 1;
				} else if (str1.length() < str2.length()) {
					return -1;
				} else {
					return str1.compareTo(str2);
				}
			}
		});

		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}