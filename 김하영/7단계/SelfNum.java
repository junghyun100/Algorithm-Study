package Step7;

public class SelfNum {
    public static final int MAX = 10001;
    
    public static int getNum(int x) {
        int sum = x;
        while(x >= 10) {
            sum += x%10;
            x /= 10;
        }
        sum += x;
        return sum;
    }
    public static void main(String[] args) {
        boolean[] isSelfNum = new boolean[MAX];
        for(int i = 1; i < MAX; i++) {
            for(int j = getNum(i); j < MAX; j = getNum(j)) {
                if(isSelfNum[j]) {
                	continue;
                }
                else {
                	isSelfNum[j] = true;
                }
            }
        }
        for(int i = 1; i < MAX; i++) {
            if(!isSelfNum[i])
                System.out.println(i);
        }
    }
}