import java.util.*;
public class Tournament{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Jimin = scanner.nextInt();
        int Hansu = scanner.nextInt();
        int count = 0;
        while(Jimin != Hansu){
            Jimin = Jimin/2 + Jimin%2;
            Hansu = Hansu/2 + Hansu%2;
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}