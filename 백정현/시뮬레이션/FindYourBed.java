import java.util.Scanner;

class FindYourBed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[][] map = new char[101][101];

        for (int i = 0; i < N; i++) {
            String[] str = scanner.next().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = str[j].charAt(0);
            }
            map[i][N] = 'X';
            map[N][i] = 'X';
        }

        int row = 0;
        int colum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                row += (map[i][j] == '.' && map[i][j + 1] == '.' && map[i][j + 2] == 'X') ? 1 : 0;
                colum += (map[j][i] == '.' && map[j + 1][i] == '.' && map[j + 2][i] == 'X') ? 1 : 0;
            }
        }
        System.out.println(row+" "+colum);
    }
}