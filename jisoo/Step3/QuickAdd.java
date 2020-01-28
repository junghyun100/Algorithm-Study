import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuickAdd{
    public static void main(String[] args){
        int n, a, b;
        try{
            BufferedReader br;
            BufferedWriter bw;
            br = new BufferedReader(new InputStreamReader(System.in));
            n = br.read();
            for(int i = 0; i < n; i++){
                System.out.println(i);
                // br = new BufferedReader(new InputStreamReader(System.in));
                // a = br.read();
                // br = new BufferedReader(new InputStreamReader(System.in));
                // b = br.read();
                // System.out.println(a+b);                

                // bw = new BufferedWriter(new OutputStreamWriter(System.out));
                // bw.write(a+b);
                // bw.flush();
                
                // br.close();
                // bw.close();
            }
        }catch(Exception e){

        }
    }
}