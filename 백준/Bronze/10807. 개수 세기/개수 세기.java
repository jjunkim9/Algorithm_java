import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int A, count = 0;
        String[] num = br.readLine().split(" ");
        for (int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(num[i]);
        }
        int V = Integer.parseInt(br.readLine());
        for (int i = 0; i<N; i++){
            if (arr[i]==V) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
