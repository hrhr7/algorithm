package 아이패드주문하기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Order {
    int screen;
    int color;
    int memory;
    int netWork;
    String name;
    String serial;
    String nowDate; //제조일
    int cnt = 0;

    Scanner sc = new Scanner(System.in);

    Order(String name){ //메소드를 만드는건가?
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yymmdd");
        nowDate = sdf.format(now);
        cnt++;
        nowDate = nowDate+cnt;

    }

//    boolean choicePad(){
//
//    }

}
