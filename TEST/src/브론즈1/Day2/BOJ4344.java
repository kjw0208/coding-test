package 브론즈1.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int S = 0;
            int P[] = new int[N];

            for (int j = 0; j < N; j++) {
                P[j] = Integer.parseInt(st.nextToken());
                S += P[j];
            }
            double Avg =  S / (double)N;
            int over_Avg = 0;
            for (int j = 0; j < N; j++) {
                if (Avg < P[j]) {
                    over_Avg++;
                }
            }
            System.out.println(Math.round(over_Avg / (double) N*100*1000)/1000.0+"%");

        }
    }
}
