package 백준25304번;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total  = sc.nextInt(); //영수증 총 금액
        int count = sc.nextInt(); //구매한 물건의 수

        for(int i = 0; i<count ;i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total-(price*num);
        }
        if(total==0) {
            System.out.println("Yes");
        } else System.out.println("No");
    }

}
