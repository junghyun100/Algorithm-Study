import java.util.Scanner;

public class Stick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAX = Integer.MIN_VALUE;
        int IN;
        int OUT;
        int people=0;
        for (int i = 0; i < 4; i++) {
            OUT = scanner.nextInt();
            IN =scanner.nextInt();
            people=people+IN-OUT;
            if(MAX<people) MAX = people;
        }
        System.out.println(MAX);
    }
}