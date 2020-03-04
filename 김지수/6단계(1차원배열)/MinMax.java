import java.util.Scanner;

public class MinMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n, min, max;
		int[] arr;
		max = -1000000;
		min = 1000000;

		n = sc.nextInt();
		arr = new int[n];

		for(int i = 0; i< n; i++){
			arr[i] = sc.nextInt();
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println(min + " " + max);
	}
}