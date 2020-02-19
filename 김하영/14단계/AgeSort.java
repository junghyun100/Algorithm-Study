package Step14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AgeSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String arr[][] = new String[N][2];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = scanner.next();
			arr[i][1] = scanner.next();
		}
		
		Arrays.sort(arr,new Comparator<String[]>(){
            @Override
            public int compare(String[] str1, String[] str2){
            	if(Integer.parseInt(str1[0]) > Integer.parseInt(str2[0])) {
            		return 1;
            	} else if (Integer.parseInt(str1[0]) < Integer.parseInt(str2[0])) {
            		return -1;
            	} else {
            		return 0;
            	}
            }
        });
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}
