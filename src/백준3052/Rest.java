package 백준3052;

import java.util.Scanner;

public class Rest {
    public static void main(String[] args) {
        int[] arr = new int[42]; //배열의 갯수 나머지 개수만큼 만듦
        Scanner sc = new Scanner(System.in);
        int num;
        int cnt =0; // 서로 다른 나머지 개수를 측정하기 위한 변수
        for(int i =0; i<10;i++){
            num = sc.nextInt();
            arr[num%42] = 1;
        }
        for(int i =0; i<arr.length; i++){
            cnt += arr[i];
        }
        System.out.println(cnt);
    }
}
