import java.util.Scanner;

public class Coin2 {
    static int[] coin;
    static int[] sum;
    static int N;
    static int K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();

        coin = new int[N + 1];
        sum = new int[K + 1];

        for (int i = 0; i < N; i++) {
            coin[i] = scanner.nextInt();
        }
        solve();
    }
    public static void solve(){
        for(int i=0; i<N; i++)
        {
            int current = coin[i];
            for(int j = current; j<=K;j++)
            {
                if(j==current){
                    sum[j]=1;
                    continue;
                }
                if((sum[j]==0 || sum[j]>= sum[j-current]+1) && sum[j-current]!=0)
                    sum[j]= sum[j-current]+1;
            }
        }
        if(sum[K]!=0)
            System.out.println(sum[K]);
        else   
            System.out.println(-1);
    }
}