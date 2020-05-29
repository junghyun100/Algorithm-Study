package BOJ.지능형기차;

import java.util.Scanner;

/**
 *
 * 1.문제 이해
 * 네개의 역에서 승차한 사람 하차한 사람이 주어질때 기차에 사람이 가장 많을때의 사람 수를 계산
 *
 * 2.알고리즘 설계
 *
 *  1번역에서 0명 내리고 32명 승차 총원 32명
 *  2번역에서 3명 내리고 13명 승차 총원 32-3+13 = 29+13 = 42
 *  3번역에서 28명 내리고 25명 승차 총원 42-28+25 = 14 + 25 = 39
 *  4번역에서 39명 내리고 0명 승차 총원  총원 0명
 *
 *  42명이 가장 많다.
 *
 *  res = Math.max(res,count);
 */
public class Main {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i< 4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            total = total - out + in;

            answer = Math.max(answer,total);
        }

        System.out.println(answer);
    }
}


