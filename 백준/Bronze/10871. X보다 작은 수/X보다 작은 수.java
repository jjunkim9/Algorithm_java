import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] num1 = br.readLine().split(" ");
        int N = Integer.parseInt(num1[0]);
        int X = Integer.parseInt(num1[1]);
        String[] num2 = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i = 0; i<N; i++) {
            A[i] = Integer.parseInt(num2[i]);
            if (A[i] < X) {
                bw.write(A[i]+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}