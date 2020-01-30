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
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
            n = Integer.parseInt(br.readLine());
            
            for(int i = 0; i < n; i++){
                a = Integer.parseInt(br.readLine());
                b = Integer.parseInt(br.readLine());             

                bw.write(a+b);
            }
            bw.flush();
            br.close();
            bw.close();
        }catch(Exception e){

        }
    }
}