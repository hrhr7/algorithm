package 쓰레드만들기;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("강력한 체력과 물리공격력의 전사 이름을 입력 : ");
        String warriorName = sc.next();
        System.out.println("궁극의 마법 능력을 지닌 법사 이름을 입력 : ");
        String wizardName = sc.next();

        Character warrior = new Character("바리안린", 8, 2, 0.8, 0.5, 40, 400);
        Character wizard = new Character("제이나", 2, 30, 0.5, 0.9, 180, 250);
        GameThA gameThA = new GameThA(warrior, wizard);
        GameThB gameThB= new GameThB(warrior, wizard);
        gameThA.start();
        gameThB.start();
    }
}
