import java.util.Scanner;
//1 = 1;
//2 = [1 + 1], 2;
//3 = [1 + 1 + 1], [1 + 2], [2 + 1], 3;
//4 = [1 + 1 + 1 + 1], [1 + 1 + 2], [1 + 2 + 1], 
//    [1 + 3], [2 + 1 + 1],[2 + 2],[3 + 1]
class OneTwoThreePlus{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int T = scanner.nextInt();
    
        int []dp= new int[11];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i = 0 ; i < T; i++)
        {
            int N = scanner.nextInt();
            for(int j = 4 ; j <=N; j++)
            {
                dp[j]= dp[j-1]+dp[j-2]+dp[j-3];
            }
            System.out.println(dp[N]);
        }
    }
}