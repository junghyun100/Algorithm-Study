import java.util.Scanner;
import java.util.Stack;

class Key {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int testCase = scanner.nextInt();//testcase받기
        for(int tc = 0; tc < testCase; tc++)
        {
            String str = scanner.next();//문자열 입력
            Stack<Character> stack1 = new Stack<>();//문자 하나하나씩 stack에 넣을 예정
            Stack<Character> stack2 = new Stack<>();//"<"를 통해 빼낸 문자열 저장할 stack 
            for(int i = 0; i < str.length();i++)
            {
                if(str.charAt(i)=='<')
                {
                    if(!stack1.isEmpty()){
                        stack2.push(stack1.pop());//stack1에 값이 들어있으므로 빼내어서 stack2에 임시 저장
                    }
                }
                else if(str.charAt(i)=='>')
                {
                    if(!stack2.isEmpty()){
                        stack1.push(stack2.pop());//stack2에 값이 들어있으므로 빼내어서 stack1에 임시 저장
                    }
                }
                else if(str.charAt(i)=='-')
                {
                    if(!stack1.isEmpty()){
                        stack1.pop();//-는 삭제이므로 stack1에 저장된 값을 하나 빼줌
                    }
                }
                else{
                    stack1.push(str.charAt(i));//나머지는 그대로 입력시키면 됨
                }
            }
            while(!stack2.isEmpty())//stack2에 값이있다면?
            {
                stack1.push(stack2.pop());//남은 값들을 넣어줍니다.
            }
            StringBuilder sb = new StringBuilder();//써주는 이유는 일반 println으로 하나씩 하면 시간초과
            while(!stack1.isEmpty())
                sb.append(stack1.pop());
            System.out.println(sb.reverse());
        }
    }
}