import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        String[] num = br.readLine().split(" ");
        for (int i=0; i<N; i++){
            A[i] = Integer.parseInt(num[i]);
        }
        int min = A[0];
        int max = A[N-1];
        for (int i=0;i<N;i++){
            if (A[i]<min) min = A[i];
            else if(A[i]>max) max = A[i];
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}