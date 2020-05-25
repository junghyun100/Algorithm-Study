package 시뮬레이션;

import java.util.Scanner;

public class Cubing {
	static char[][][] cube = new char[6][3][3]; // 큐브 생성
	static final int U = 0, D = 1, F = 2, B = 3, L = 4, R = 5; // 방향

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			setCube(); // 초기화
			int n = sc.nextInt(); // 몇번 돌릴껀지
			sc.nextLine();
			String s[] = sc.nextLine().split(" "); // 돌릴 면과 방향
			for(int j = 0; j<n; j++) { // n만큼 돌림
				boolean clock = s[j].charAt(1) == '+'; // 방향
				switch (s[j].charAt(0)) { // 돌릴 면
				case 'U': 
					    // 앞, 위, 왼, 아래,오른
					rotate(U, L, F, R, B, clock);
					break;
				case 'D': 
					rotate(D, B, R, F, L, clock); 
					break;
				case 'F':
					rotate(F, U, L, D, R, clock); 
					break;
				case 'B': 
					rotate(B, R, D, L, U, clock); 
					break;
				case 'L': 
					rotate(L, F, U, B, D, clock);
					break;
				case 'R': 
					rotate(R, D, B, U, F, clock);
					break;
				}
			}

			print();
		}
		
		sc.close();
	}
	static void setCube() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				cube[U][i][j] = 'w'; // 위
				cube[D][i][j] = 'y'; // 아래
				cube[F][i][j] = 'r'; // 앞
				cube[B][i][j] = 'o'; // 뒤
				cube[L][i][j] = 'g'; // 왼
				cube[R][i][j] = 'b'; // 오
			}
		}
	}


	private static void rotate(int f, int u, int l, int d, int r, boolean clock) {
		char[][] temp = new char[3][3]; // 임시로 담아놓을 면
		char[] temp2 = new char[3]; // 나머지 연관된 면
		// 시계 방향
		if(clock) {
			for (int i=0; i<3; ++i) {
				for (int j=0; j<3; ++j) {
					temp[i][j] = cube[f][2-j][i]; // 시계방향으로 돌렸을때 앞면
				}
			}
			for (int i=0; i<3; ++i) {
				temp2[i] = cube[u][i][0]; // 위쪽면의 제일 왼쪽 줄
			}
			for (int i=0; i<3; ++i) {
				cube[u][i][0] = cube[l][0][2-i]; // 왼쪽면의 제일 위쪽 줄
			}
			for (int i=0; i<3; ++i) {
				cube[l][0][2-i] = cube[d][2][i]; // 아래쪽면의 제일 아래 줄
			}
			for (int i=0; i<3; ++i) {
				cube[d][2][i] = cube[r][2-i][2]; // 오른쪽 면의 제일 오른쪽 줄
			}
			for (int i=0; i<3; ++i) {
				cube[r][2-i][2] = temp2[i];
			}

		}
		// 반시계 방향
        else {
            for (int i=0; i<3; ++i)
                for (int j=0; j<3; ++j) {
                    temp[i][j] = cube[f][j][2-i]; // 반시계방향으로 돌렸을때 앞면 인덱스
                }
            for (int i=0; i<3; ++i) {
            	temp2[i] = cube[u][i][0]; // 위쪽면의 제일 왼쪽 줄
            }
            for (int i=0; i<3; ++i) {
            	cube[u][i][0] = cube[r][2-i][2]; // 오른쪽면의 제일 오른쪽 줄
            }
            for (int i=0; i<3; ++i) {
            	cube[r][2-i][2] = cube[d][2][i]; // 아래쪽면의 제일 아래 줄
            }
            for (int i=0; i<3; ++i) {
            	cube[d][2][i] = cube[l][0][2-i]; // 왼쪽면의 제일 위쪽 줄
            }
            for (int i=0; i<3; ++i) {
            	cube[l][0][2-i] = temp2[i];
            }
        }
		
		cube[f] = temp; // 앞면에 바뀐(시계,반시계 방향으로 돌린) 앞면을 넣어줌
	}
	
	static void print() {
		for (int i=0; i<3; ++i) {
			for (int j=0; j<3; ++j) {
				System.out.print(cube[0][j][2-i]);
			}
			System.out.println();
        }
	}
}
