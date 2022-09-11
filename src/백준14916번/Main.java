package 백준14916번;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(true){//반복횟수 몰라서 while
            if(n%5==0) {
                count+=n/5;
                break;// 반복문탈출
            }
            else {
                n-=2; //5로 나눠지지 않으면 2를 빼고 5로 나눠지는지 확인
                count++;
            }
            if(n<0){
                System.out.println(-1);
                return;//반복문이 아니라 함수탈출
            }
        }
        System.out.println(count);
    }
}
