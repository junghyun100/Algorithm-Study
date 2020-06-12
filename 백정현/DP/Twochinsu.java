import java.util.Scanner;

class Twochinsu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[]dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i =2; i<= n;i++)
        {
            dp[i]=dp[i-2]+dp[i-1];
        }
        System.out.println(dp[n]);
    }
}