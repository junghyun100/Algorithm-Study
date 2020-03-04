import java.util.Scanner;

public class OXquiz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ox = new String[n];
		int count,score;

		for(int i = 0; i<n; i++){
			ox[i] = sc.next();
		}

		for(int i = 0; i<n; i++){
			score = 0;
			count = 0;
			for(int j =0; j<ox[i].length(); j++){
				if(ox[i].charAt(j) == 'O'){
					count++;
					score += count;
				}
				else if(ox[i].charAt(j) == 'X'){
					count=0;
				}
			}
			System.out.println(score);
		}
	}
}