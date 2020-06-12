import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Laboratory{
    static int blank = 0;
    static int wall = 1;
    static int virus = 2;
    static int [] dx = {0,0,1,-1};
    static int [] dy = {1,-1,0,0};
    static int n,m;
    static int [][] array;
    static int [][] map;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        
        array = new int[n][m];
        map = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                array[i][j] = map[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < n; i++){
            for(int j =0 ; j < m; j++){
                if(array[i][j]==blank){
                    map[i][j]= wall;
                    dfs(1);
                    map[i][j]= blank;
                }
            }
        }
        System.out.println(answer);
    }
    public static void dfs(int count){
        if(count == 3){
            bfs();
            return;
        }
        for(int i =0 ; i < n; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(map[i][j]==blank)
                {
                    map[i][j] =wall;
                    dfs(count + 1);
                    map[i][j] = blank;
                }
            }
        }
    }
    public static void bfs(){
        int[][] virusMap = new int[n][m];
        for(int i =0 ; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                virusMap[i][j]=map[i][j];
            }
        }
        Queue<Point> queue = new LinkedList<Point>();
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ;  j < m; j++)
            {
                if(virusMap[i][j]==virus)
                queue.add(new Point(i,j));
            }
        }
        while(!queue.isEmpty()){
            Point p = queue.remove();
            int x = p.x;
            int y = p.y;
            for(int i = 0; i < 4; i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(virusMap[nx][ny] == blank) {
                        virusMap[nx][ny] = virus;
                        queue.add(new Point(nx, ny));
                    }
                }
            }
        }
        calculater(virusMap);
    }
    public static void calculater(int[][]virusMap)
    {
        int count =0;
        for(int i = 0 ;i < n; i++)
        {
            for(int j = 0; j < m; j++){
                if(virusMap[i][j]==blank)
                count++;
            }
        }
        answer = Math.max(count,answer);
    }
}
