import java.util.Scanner;

public class LessThanX{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, x;
        int[] num;
        n = sc.nextInt();
        x = sc.nextInt();
        num = new int[n];
        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(num[i] < x){
                System.out.print(num[i] + " ");
            }
        }

        sc.close();
    }
}