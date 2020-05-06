import java.util.*;

public class Slop {
    static int N, L, answer;
    static int[][] map1, map2;
    static int[] line;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        L = scanner.nextInt();

        map1 = new int[N][N];
        map2 = new int[N][N];

        for(int i = 0; i < N; i++)
            for(int j = 0 ; j < N; j++)
                map1[i][j] = map2[j][i] = scanner.nextInt();
        for(int i = 0 ; i < N; i++)
        {
            checkMap(i,map1);
            checkMap(i,map2);
        }
        System.out.println(answer);
    }
    private static void checkMap(int index, int[][]map){
        line = new int[N];
        for(int i = 0 ; i < N-1; i++)//다음 것과 같지 않은 경우 체크
        {
            if(map[index][i] != map[index][i+1]){
                int gap = map[index][i] - map[index][i+1];
                if(gap != -1 && gap != 1) return; // 차이가 1보다 크면 X
                if(gap == -1)
                {
                    for(int j = 0 ; j < L; j++)//왼쪽에서 경사가 시작
                    {
                        if(i-j <0 || line[i-j] ==1) return;//범위를 넘어갈 때, 이미 설치된 적있는가
                        if(map[index][i] == map[index][i-j]) line[i-j] = 1; //설치
                        else return;
                    }
                }
                else
                {
                    for(int j = 1; j <= L; j++)//오른쪽에서 경사가 시작
                    {
                        if(i+j >=N || line[i+j] ==1) return;//범위를 넘어갈 때, 이미 설치된 적있는가
                        if(map[index][i] -1 == map[index][i+j]) line[i+j] = 1; //설치
                        else return;
                    }
                }
            }
        }
        answer++;
    }
}