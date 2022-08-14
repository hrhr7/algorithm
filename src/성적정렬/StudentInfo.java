package 성적정렬;
//정렬을 위한 클레스(이름과 성적 저장)
//Comparable interface 구현 (compareTo()메소드를 상속받아 우리가 정한 기준으로 정렬
public class StudentInfo implements Comparable<StudentInfo> {
    public String name; // 게터세터 안만드려고 public붙임
    public int score;
//생성자를 통해서 인스턴스 필드를 초기화
    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    //성적이 높은 사람 순으로 정렬(내림차순)
    //compareTo()는 정수형 반환값을 가진다 같으면 0, 다르면 1, -1
    //반환값이 1인 경우는 정렬 조건이 됨 -1은 상태 유지
    public int compareTo(StudentInfo o) { //매개변수(StudentInfo o) 1개라는건 자기자신과비교
        if(this.score==o.score) return 0;
        else if(this.score>o.score) return -1; // 정렬하지 않겠다는 뜻
        else return 1; // 정렬 조건
    }
}
