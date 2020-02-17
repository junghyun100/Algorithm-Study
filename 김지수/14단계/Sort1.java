import java.util.Scanner;

public class Sort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Insertion_Sort(arr, N);
		for(int i = 0; i<N; i++){
			System.out.println(arr[i]);
		}
	}
	public static void Insertion_Sort(int list[], int n) {
		int i, j, key;
		
		for(i = 1; i<n; i++) {
			key = list[i];
			
			for(j = i-1; j>=0 && list[j] > key; j--) {
				list[j+1] = list[j];
			}
			
			list[j+1] = key;
		}
	}
}
