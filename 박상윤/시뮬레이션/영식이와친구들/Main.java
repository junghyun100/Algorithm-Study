package BOJ.영식이와친구들;

import java.util.Scanner;

/**
 * 1. 문제 이해
 *
 *
 * - 번자리에 앉은 사람이 공을 받는다. 그리고 나서 공을 다른 사람에게 던진다.
 * - 다시 공을 받은 사람은 다시 공을 던지고 이를 계속 반복한다.
 * - 한 사람이 공을 M번 받았으면 게임은 끝난다
 * - 공을 M번 보다 적게 받은 사람 공을 던질 때,
 *    - 현재 공을 받은 횟수가 홀수번이면 자기의 현재 위치에서 시계방향으로 L번째 있는 사람에게
 *    - 짝수번이면 자기의 현재 위치에서 반시계 방향으로 L번째 있는 사람에게 공을 던진다.
 *
 *  공을 총 몇 번 던지는지 구하는 프로그램을 작성하자
 *
 *  2. 설계
 *
 *  - 어떤 자료구조를 이용할까?
 *
 *  먼저 각 자리를 표현할 자료구조가 필요하다. 배열을 사용하면 적절하다.
 *  인덱스 번호를 자리번호로 하고 인덱스의 값은 공을 받은 회수로 설정
 *
 * 0 1 2 3 4 5 6 7
 */
public class Main {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int current = 0;
        int next = 0;
        int count = 0;
        int [] friends = new int[n];


        while(true) {
            if(++friends[current] == m) break;
            if(friends[current] % 2 == 0) {
                next = current + l >= n ? l - (n - current)  : current + l;
            }
            else {
                next = current - l < 0  ? n - (l - current)  : current - l;
            }
            current = next;
            count++;

        }



        System.out.println(count);

    }

}
