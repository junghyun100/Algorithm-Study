import java.util.Scanner;

public class Bertrand{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int count = 0;
			int n = sc.nextInt();
			if(n == 0)
				break;

			for(int i = n+1; i<=2*n; i++){
				boolean isPrime = true;
				for(int j = 2; j<=Math.sqrt(i); j++){
					if(i%j == 0){
						isPrime = false;
						break;
					}
				}
				if(isPrime  && i > 1){
					count++;
				}
			}
			System.out.println(count);
		}		
	}
}