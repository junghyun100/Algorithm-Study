package �ùķ��̼�;

import java.util.Scanner;

public class Cubing {
	static char[][][] cube = new char[6][3][3]; // ť�� ����
	static final int U = 0, D = 1, F = 2, B = 3, L = 4, R = 5; // ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			setCube(); // �ʱ�ȭ
			int n = sc.nextInt(); // ��� ��������
			sc.nextLine();
			String s[] = sc.nextLine().split(" "); // ���� ��� ����
			for(int j = 0; j<n; j++) { // n��ŭ ����
				boolean clock = s[j].charAt(1) == '+'; // ����
				switch (s[j].charAt(0)) { // ���� ��
				case 'U': 
					    // ��, ��, ��, �Ʒ�,����
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
				cube[U][i][j] = 'w'; // ��
				cube[D][i][j] = 'y'; // �Ʒ�
				cube[F][i][j] = 'r'; // ��
				cube[B][i][j] = 'o'; // ��
				cube[L][i][j] = 'g'; // ��
				cube[R][i][j] = 'b'; // ��
			}
		}
	}


	private static void rotate(int f, int u, int l, int d, int r, boolean clock) {
		char[][] temp = new char[3][3]; // �ӽ÷� ��Ƴ��� ��
		char[] temp2 = new char[3]; // ������ ������ ��
		// �ð� ����
		if(clock) {
			for (int i=0; i<3; ++i) {
				for (int j=0; j<3; ++j) {
					temp[i][j] = cube[f][2-j][i]; // �ð�������� �������� �ո�
				}
			}
			for (int i=0; i<3; ++i) {
				temp2[i] = cube[u][i][0]; // ���ʸ��� ���� ���� ��
			}
			for (int i=0; i<3; ++i) {
				cube[u][i][0] = cube[l][0][2-i]; // ���ʸ��� ���� ���� ��
			}
			for (int i=0; i<3; ++i) {
				cube[l][0][2-i] = cube[d][2][i]; // �Ʒ��ʸ��� ���� �Ʒ� ��
			}
			for (int i=0; i<3; ++i) {
				cube[d][2][i] = cube[r][2-i][2]; // ������ ���� ���� ������ ��
			}
			for (int i=0; i<3; ++i) {
				cube[r][2-i][2] = temp2[i];
			}

		}
		// �ݽð� ����
        else {
            for (int i=0; i<3; ++i)
                for (int j=0; j<3; ++j) {
                    temp[i][j] = cube[f][j][2-i]; // �ݽð�������� �������� �ո� �ε���
                }
            for (int i=0; i<3; ++i) {
            	temp2[i] = cube[u][i][0]; // ���ʸ��� ���� ���� ��
            }
            for (int i=0; i<3; ++i) {
            	cube[u][i][0] = cube[r][2-i][2]; // �����ʸ��� ���� ������ ��
            }
            for (int i=0; i<3; ++i) {
            	cube[r][2-i][2] = cube[d][2][i]; // �Ʒ��ʸ��� ���� �Ʒ� ��
            }
            for (int i=0; i<3; ++i) {
            	cube[d][2][i] = cube[l][0][2-i]; // ���ʸ��� ���� ���� ��
            }
            for (int i=0; i<3; ++i) {
            	cube[l][0][2-i] = temp2[i];
            }
        }
		
		cube[f] = temp; // �ո鿡 �ٲ�(�ð�,�ݽð� �������� ����) �ո��� �־���
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
