package 시뮬레이션;

import java.util.Scanner;

public class ILoveCroatia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int boom = sc.nextInt(); // 폭탄을 들고 있는 사람
		int N = sc.nextInt(); // 질문 개수
		sc.nextLine(); // nextInt와 nextLine사용시 문제점 해결
		int totalTime = 210; // 총 시간 3분 30초 
		int currentTime = 0; // 현재 시간
		
		for(int i = 0; i < N; i++) {
			String[] str = sc.nextLine().split(" ");
			int time = Integer.parseInt(str[0]);
			currentTime += time;
			if(totalTime <= currentTime) { // boom
				break;
			}

			while(!str[1].equals("T")) { // 정답이 아닐 때
				String[] str2 = sc.nextLine().split(" "); // 다시 문제를 받고 대답
				int time2 = Integer.parseInt(str2[0]); // 다시 받은 시간
				currentTime += time2;
				if(currentTime >= totalTime || str2[1].equals("T")) // 폭탄이 터지거나 정답을 맞췄을 시 break;
					break;
			}

			if(totalTime > currentTime) { // 폭탄이 안터졌다면
				boom++; // 다음사람에게 넘김
				if(boom > 8) // 8번째면 1번째로 넘김
					boom = 1;
			}
			else { // 질문N개가 끝나기전에 폭탄이 터졌다면 break;
				break;
			}

		}
		
		System.out.println(boom);
		
		sc.close();
	}

}
