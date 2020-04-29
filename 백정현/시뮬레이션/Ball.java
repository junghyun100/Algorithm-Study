import java.util.*;

public class Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int point = 1;
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == point)
                point = b;
            else if (b == point)
                point = a;
        }
        System.out.println(point);
    }
}