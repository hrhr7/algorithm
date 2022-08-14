package 주민등록번호;

import java.util.Calendar;
import java.util.Scanner;

public class IDEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력 하세요 : ");
        String jumin = sc.next();

        Calendar now = Calendar.getInstance();
        int thisYear = now.get(Calendar.YEAR);
        int jYear =0, jMonth=0, jDay=0, jGender = 0;

        for(int i = 0; i<jumin.length();i++){
            if(i==0) jYear = (jumin.charAt(0)-'0')*10;
            if(i==1)jYear += jumin.charAt(1)-'0';
            if(i==2)jMonth=(jumin.charAt(2)-'0')*10;
            if(i==3) jMonth += jumin.charAt(3)-'0';
            if(i==4) jDay = (jumin.charAt(4)-'0') *10;
            if(i==5) jDay += jumin.charAt(5)-'0';
            if(i==7)jGender = jumin.charAt(7)-'0';
        }
        if(jGender==1 ||jGender==2) {

        }
    }
}
