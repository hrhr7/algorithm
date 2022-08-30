package 백준7568번;

import java.util.Scanner;

public class Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] x = new int[N]; //몸무게
        int [] y = new int[N]; // 키

        for(int i =0 ; i<N; i++){ // N값만큼 키 몸무게 입력
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i =0; i<N;i++){ //배열 비교
            int count = 1;
            for(int j =0; j<N; j++){
                if(x[i]<x[j] && y[i]<y[j])
                    count++;
            }
            System.out.print(count+" ");
        }
    }
}
