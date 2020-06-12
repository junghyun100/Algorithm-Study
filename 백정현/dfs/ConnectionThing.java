import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class ConnectionThing {
    static int n;
    static int m;
    static int[][] map;
    static boolean[] visited;
    static int result = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        n = scanner.nextInt();
        m = scanner.nextInt();
        
        map = new int[n][n];
        visited = new boolean[n];
        
        for(int i=0; i<m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            map[a-1][b-1] = 1;
            map[b-1][a-1] = 1;
        }
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                bfs(i);
                result++;
            }
        }
        
        System.out.println(result);
        
    }
    
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start] = true;
        
        while(!queue.isEmpty()) {
            int v = queue.poll();
            
            for(int i=0; i<n; i++) {
                if(map[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}