import java.util.Scanner;

import sun.security.util.Length;

public class Stick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();// x
        int count = 0;// 카운트
        int stickLength = 32;// 초기값
        int sum = 0;
        if(x == 64)
        {
            count =1;
        }
        else{
            while(true)
            {
                if(x == sum + stickLength){
                    count++;
                    break;
                }
                else if(x > sum + stickLength){
                    sum+=stickLength;
                    count++;
                    stickLength/=2;
                }
                else if(x < sum+stickLength){
                    stickLength/=2;
                }
            }
        }
        System.out.println(count);
        scanner.close();       
        }
}