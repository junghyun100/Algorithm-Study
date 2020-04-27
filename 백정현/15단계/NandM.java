import java.util.Scanner;

public class NandM{
    static int [] array;
    static int [] visited;
    static int N,M;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N= scanner.nextInt();
        M = scanner.nextInt();
        array = new int[N+1];
        visited = new int[N+1];
        backTracking(0);
    }
    static void backTracking(int count)
    {
        if(count==M)
        {
            for(int i = 0 ; i < M;i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.println("");
            return;
        }
        for(int i = 1 ;i <=N;i++)
        {
            if(visited[i]==1) continue;
            visited[i]=1;
            array[count]=i;
            backTracking(count+1);
            visited[i]=0;
        }
    }

}