import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isReverse;
		boolean isError;
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			String[] strAC = sc.next().split("");
			int N = sc.nextInt();
			String strElement = sc.next();
			strElement = strElement.substring(1, strElement.length() -1);
			ArrayList<String> list = new ArrayList<>(Arrays.asList(strElement.split(",")));
			isReverse = false;
			isError = false;
			
			for (int j = 0; j < strAC.length; j++) {
				if(isError)
					break;
				
				if(strAC[j].equals("R")) {
					isReverse = !isReverse;
				}else {
					if(list.isEmpty() || N ==0) {
						System.out.println("error");
						isError = true;
					}else {
						if(isReverse) {
							list.remove(list.size()-1);
						}else {
							list.remove(0);
						}
					}
				}
			}
			
			if(!isError) {
				System.out.print("[");
				if(isReverse) {
					for(int j = list.size()-1; j>0; j--) {
						System.out.print(list.get(j) + ",");
					}
					System.out.println(list.get(0) + "]");
				}else {
					for (int j = 0; j < list.size()-1; j++) {
						System.out.print(list.get(j) + ",");
					}
					System.out.println(list.get(list.size()-1) + "]");
				}
				
			}
			
			
		}
		
		sc.close();
	}

}
