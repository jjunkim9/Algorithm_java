import java.io.*; //buffer 출력 기본 구조
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] num = br.readLine().split(" "); //split : 입력 받은 걸 괄호 안의 문자를 기준으로 분류함
            int A = Integer.parseInt(num[0]);
            int B = Integer.parseInt(num[1]);
            bw.write((A + B) + "\n");
        }
        bw.flush();
        bw.close(); //buffer출력을 쓰고 난뒤 사용
    }
}