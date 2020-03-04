import java.util.Scanner;

public class Remain{
	public static void main(String[] args){
		int[] n = new int[10];
		int[] remain = new int[10];
		int count = 10;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10; i++){
			n[i] = sc.nextInt();
			remain[i] = n[i]%42;
		}
		for(int i = 0; i<9; i++){
			for(int j = i+1; j<10; j++){
				if(remain[i] == remain[j])
					count--;
			}
		}

		System.out.println(count);
	}
}