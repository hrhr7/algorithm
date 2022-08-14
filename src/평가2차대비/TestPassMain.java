package 평가2차대비;
import java.util.Scanner;
public class TestPassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하시오 : ");
        int num = sc.nextInt(); //정수 입력 받음
        int sum = 0; //합을 구하기 위해서는 값을 누적해야 하므로 반드시 초기화 필수
        if (num > 0) { // 조건식 체크(문제)
            int i = 1;
            while(i<=num){ //반복문의 문제는 i값을 변경해주는 코드가 없음
                sum += i;
                i++; //i 값을 변경 해주는 코드 필요함(문제)
            }
            System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다.");
        } else {
            System.out.println("숫자가 1이상 이어야 합니다.");
        }
    }
}
