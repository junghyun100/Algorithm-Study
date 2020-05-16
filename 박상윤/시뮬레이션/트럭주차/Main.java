/**
 * 한 대 주차할 때는 1분에 한 대당 A원을 내야한다.
 * 두 대 주차할 때는 1분에 한 대당 B원 내야한다.
 * 세 대 주차할 때는 1분에 한 대당 C원을 내야한다.
 *
 * 표로 나타내면 아래와 같다.
 *
 * t        1 2 3 4 5 6 7 8
 * 1번 트럭   5 3 1 1 1
 * 2번 트럭       1 1 1
 * 3번 트럭     3 1 1 1 5 5
 *
 *매 시간마다 트럭이 몇대 주차되어 있는지 확인하고 계
 */
import java.util.*;
class Main {

    static int time [] = new int[101];
    static int A,B,C;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String [] args) {


        Scanner sc = new Scanner(System.in);


        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();


        for(int i = 0; i < 3; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j = start; j < end; j++) {
                time[j]++;
            }

            if(start < min) min = start;
            if (max < end) max = end;
        }


        System.out.println(calculate());


    }


    public static int calculate() {
        int totalPrice = 0;
        for(int i = min; i <= max; i++) {
            if(time[i] == 1) totalPrice += (time[i] * A);
            else if(time[i] == 2) totalPrice += (time[i] * B);
            else totalPrice += (time[i] * C);
        }

        return totalPrice;
    }

}