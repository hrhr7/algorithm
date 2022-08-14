package 단어정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

//사용자로부터 단어 입력 개수를 입력 받음
//개수만큼의 단어를 입력
//길이가 짧은것부터, 길이가 길면 사전순, 중복 제거
public class WordSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어 입력 갯수
        String[] word = new String[n]; //개수만큼 배열 생성
        sc.nextLine(); //버퍼비우기(개행문자가 다음 입력값으로 들어가는것을 방지)
        for(int i =0; i < word.length; i++){
            word[i] = sc.nextLine(); // 엔터키 기준으로 입력 받기 위해 nextline사용
        }
        //중복제거 set() : 순서를 보장하지 않음, 중복 허용 하지 않음
        //aslist 배열 입력 받을
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        //new String[0] 0넣은건 원래 생성된 크기만큼을 넘긴다는 의미
        //중복제거하고 배열 다시 만들어짐
        word = hashSet.toArray(new String[0]);
        //두번째 매개변수에 정렬방법(new comparator) 을 넣어줌
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); //길이가 같으면 사전순 정렬
                } else {
                    return o1.length() - o2.length();
                    //앞 단어가 길면 양수가 반환(정렬조건)
               }
            }
        });
        System.out.println(Arrays.toString(word));

    }
}
