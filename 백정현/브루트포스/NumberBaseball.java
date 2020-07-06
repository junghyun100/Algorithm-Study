import java.util.Scanner;

class NumberBaseball{
    static int N;
    static int[][] input;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        input = new int[N][5];

        for(int i = 0 ; i < N ;i++)
        {
            int guess = scanner.nextInt();
            int strike = scanner.nextInt();
            int ball = scanner.nextInt();

            input[i][0] = guess/100;
            input[i][1] = (guess-(input[i][0]*100))/10;
            input[i][2] = guess%10;
            input[i][3] = strike;
            input[i][4] = ball;
        }
        int result = 0;
        for(int i = 1; i<=9; i++){
            for(int j = 1; j <= 9; j++)
            {
                if(i==j) continue;
                for(int k = 1; k<=9;k++)
                {
                    if(i==k) continue;
                    if(j==k) continue;
                    boolean flag = true;
                    for(int l = 0; l < N;l++)
                    {
                        int strike =0;
                        int ball=0;

                        if(i==input[l][0]) strike++;
                        else if(i==input[l][0]||i==input[l][2]) ball++;
                        if(j==input[l][1]) strike++;
                        else if(j==input[l][0]||j==input[l][2]) ball++;
                        if(k==input[l][2]) strike++;
                        else if(k==input[l][0]||k==input[l][1]) ball++;
                        if(strike!=input[l][3]||ball!=input[l][4]){
                            flag =false;
                            break;
                        }
                    }
                    if(flag){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}