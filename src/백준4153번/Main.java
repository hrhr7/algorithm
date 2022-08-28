package 백준4153번;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[2]*arr[2] == ((arr[0]*arr[0])+(arr[1]*arr[1]))) {
            System.out.println("right");
        } else System.out.println("Wrong");
    }
}
