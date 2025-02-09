package Day5;

import java.util.Scanner;

public class BOj10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int AVG = 0;
        for (int i=0; i<5; i++){
            int A = sc.nextInt();

            if (A<40){
                A = 40;
            }
            AVG += A;
        }
        System.out.println(AVG/5);



    }
}
