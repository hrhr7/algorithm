package 백즌2839번;

import java.util.Scanner;

public class Sugar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(true) {
            if (n%5==0) {
                cnt += n/5;
                break;
            }
            else {
                n -=3;
                cnt++;
            }
            if(n<0){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(cnt);
    }
}
