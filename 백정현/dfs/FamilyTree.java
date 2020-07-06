import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class FamilyTree{
    static int N;
    static int start;
    static int end;
    static int M;

    static int[][] map;
    static int[] distance;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        start = scanner.nextInt();
        end = scanner.nextInt();
        M = scanner.nextInt();
        
        map = new int[N+1][N+1];
        distance = new int[N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++)
        {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();

            map[input1][input2] = 1;
            map[input2][input1] = 1;
        }
        bfs(start, end);

        if(distance[end]==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(distance[end]);
        }

        scanner.close();
    }
    static void bfs(int start, int end)
    {
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(start);
        visited[start] = true;

        loop:while(!que.isEmpty()){
            int value = que.poll();

            if(value == end){
                break loop;
            }

            for(int i = 1; i<=N;i++)
            {
                if(map[value][i] == 1 && !visited[i]){
                    que.add(i);
                    visited[i]= true;
                    distance[i] = distance[value]+1;
                }
            }
        }
    }
}