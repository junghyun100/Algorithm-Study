import java.util.Scanner;
import java.util.Stack;

class GoodWord{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int answer =0;

        for(int i =0 ; i < N; i++)
        {
            String word = scanner.nextLine();
            Stack<Character> st = new Stack<>();

            for(int j=0; j < word.length(); j++ )
            {
                if(!st.isEmpty() && st.peek() == word.charAt(j)){
                    st.pop();
                }
                else st.push(word.charAt(j));
            }
            if(st.size()==0) answer++;
        }
        System.out.println(answer);
    }
}