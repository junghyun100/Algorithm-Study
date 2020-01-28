import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            sum += (i+1);
        }
        System.out.println(sum);
        sc.close();
    }
}