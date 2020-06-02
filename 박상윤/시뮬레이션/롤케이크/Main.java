package BOJ.롤케이크;

import java.util.Scanner;

/**
 * 1. 문제 이해
 *
 *  김상근은 L미터의 롤케이크를 만든다
 *  롤케이크를 펼쳐서 1미터 단위로 잘라 놓았다.
 *  가장 왼족 조각이 1번, 오른쪽 조각이 L번조각이다.
 *
 *
 *  방청객은 1부터 N까지 번호가 매겨져있다.
 *  각 방청객은 자신이 원하는 조각을 적어서 낸다.
 *  두 수 P,K를 적어서 제 (P번부터 K까지 조각을 원한다는 의미)출
 *
 *
 *  진행자 고창영은, 제출받은 종이를 확인해서 해당하는 조각에 그 사람의 번호를 적는다
 *  이미 번호가 적혀있으면 그 조각은 얻지 못한다.
 *
 *  가장 많은 케이크를 받을 것으로 기대한 방청객의 번호와 실제로 가장 많은 케이크 조각을 받는 방청객의 번호를 구하자
 *
 * 2. 설계
 *
 * - 어떤 자료구조를 활용할까?
 *
 * 전체 케이크를 배열로 표현하면 적절하다.
 * 각 인덱스의 원소에는 케이크를 선택한 방청객의 번호를 붙이는 형태로 사용
 *
 * - 가장 많은 케이크를 받을 것으로 기대한 방청객을 어떻게 구할까?
 *
 * 제출한 번호의 gap이 크면 가장 많이 받을것으로 기대한다.
 *
 * 제출한 번호르 입력받으면서 gap을 구하고 최대값을 갱신시키자.
 *
 * - 실제로 가장 많은 케이크 조각을 받는 방청객을 어떻게 구할까?
 *
 * 0으로 마스킹 처리되어 있는 배열에서 입력받은 배열의 범위에는 해당 인덱스를 마스킹하자.
 * 0이 아닌 값으로 마스킹 되어 있으면 해당 위치는 이미 다른 방청객의 케이크이므로 마스킹하면 안된다.
 * 마스킹 작업을 완료하고, 빈도수가 가장 많은 사용자를 찾아내자.
 * */
public class Main {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int expectedMax = Integer.MIN_VALUE;
        int expectedMaxPeople = Integer.MIN_VALUE;
        int answer = Integer.MIN_VALUE;
        int maxCount = Integer.MIN_VALUE;
        int [] cake = new int[l+1];
        int [] count = new int[l+1];

        for(int i = 1; i <= n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int gap = end - start;
            if(expectedMax < gap) {
                expectedMax = gap;
                expectedMaxPeople = i;
            }
            for(int j = start; j <= end; j++) {
                if(cake[j] == 0) {
                    cake[j] = i;
                }
            }
        }

        //빈도수 구하기
        for(int i = 0; i < cake.length; i++) {
            count[cake[i]]++;
        }

        for(int i = 1; i < count.length; i++) {

            if(maxCount  < count[i]) {
                answer = i;
                maxCount = count[i];
            }
        }


        System.out.println(expectedMaxPeople);
        System.out.println(answer);
    }
}
