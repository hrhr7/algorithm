package 커피메뉴;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMain {
    static Map<String,Menu> map = new HashMap<>();
    public static void main(String[] args) {
        makeManu();
        selectManu();
    }

    static void makeManu(){
        map.put("Americano",new Menu("Americano",2000,"coffee","커피"));
        map.put("Water",new Menu("Water",1000,"Water","물"));
    }

    static void selectManu(){
        Scanner sc = new Scanner(System.in);
        String key;
        while(true){
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.println("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가,[4]메뉴삭제,[5]메뉴수정,[6]종료");
            int selMenu = sc.nextInt();
            switch (selMenu){
                case 1 :
                    for(String e : map.keySet()){
                        System.out.println("메뉴 : " +map.get(e).name);

                    } break;
                case 2 :
                    System.out.println("조회할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).name);
                    } else System.out.println("해당 메뉴 없음");
                    break;
                case 3 :
                    System.out.println("추가할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String grp = sc.next();
                        System.out.print("설명 입력 : ");
//                        sc.nextLine(); // 버퍼 비우기
                        String desc = sc.next();
                        map.put(key,new Menu(key,price,grp,desc));
                    } break;
                case 4 :
                    System.out.println("삭제할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        map.remove(key);
                    }

            }
        }
    }
}
