

import java.util.Scanner;
import java.util.Stack;

/**성
 *
 * 1. 문제
 * 키로거는 사용자가 키보드를 누른 명령을 모두 기록한다.
 * 강산이가 비밀번호를 입력할 때, 화살표나 백스페이스를 입력해도 정확한 비밀번호를 알아낼 수 있다.
 * 강산이가 비밀번호 창에서 입력한 키가 주어졌을때, 강산이의 비밀번호를 알안내는 프로그램을 작성
 *
 * 2. 문제 분석
 *
 * -  입력으로 강산이가 입력한 순서대로 길이가 L인 문자열이 들어온다.
 * -  강산이가 백스페이스를 입력했으면 -
 * -  커서 바로 앞에 글자가 존재한다면 그 글자를 지운다.
 * -  화살표 입력은 < , > 이다.
 *
 *
 * 3. 예시
 * <<BP<A>>Cd-
 * BAPC
 *
 * ThIsIsS3Cr3t
 * ThIsIsS3Cr3t
 *
 *
 * 4. 알고리즘 설계
 *
 *
 * Stack을 2개 활용하면 된다.
 *
 * - 백스페이스와 화살표이동이 아닌경우에는 result 스택에 추가시킨다.
 * - < 나오면 result에 최상단 데이터를 temp로 이동시킨다.
 * - > 나오면 temp의 최상단 데이터를 result로 이동시킨다.
 *  - -나오면 result최상단 데이터를 pop시킨다.
 *
 *  -----------------------------
 * |  B A P C
 *  -----------------------------
 *
 *  -----------------------------
 *  |
 *  ------------------------------
 *
 *
 * - temp에 남아있는 모든 데이터들을 result로 이동시킨다.
 * - 최종적으로 result에 있는 값들을 하나씩 pop시키면서 result에 붙인다.
 * - result를 reverse 시킨다.
 */
public class Main {

    public static void main(String [] args) {


        StringBuffer sf = new StringBuffer();
        Stack<Character> result = new Stack<Character>();
        Stack<Character> temp = new Stack<Character>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(char c : s.toCharArray()) {

                if(c == '<'){
                    if(!result.isEmpty()) temp.push(result.pop());
                }
                else if(c == '>'){
                    if(!temp.isEmpty())result.push(temp.pop());
                }
                else if(c == '-') {
                    if(!result.isEmpty())result.pop();
                }
                else {
                    result.push(c);
                }
            }

            while(!temp.isEmpty()) {
                result.push(temp.pop());
            }

            while(!result.isEmpty()) {
                sf.append(result.pop());
            }

            System.out.println(sf.reverse().toString());
            sf = new StringBuffer();

        }



    }

}
