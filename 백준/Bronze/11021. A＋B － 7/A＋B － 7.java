import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1;i<=T;i++){
            String[] num = br.readLine().split(" ");
            int A = Integer.parseInt(num[0]);
            int B = Integer.parseInt(num[1]);
            bw.write("Case #"+i+": "+(A+B)+"\n");
        }
        bw.flush();
        bw.close();
    }
}