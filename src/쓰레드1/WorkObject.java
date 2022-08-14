package 쓰레드1;
//작업 공유용 클래스
public class WorkObject {
    // synchronized는 스레드의 동시 접근에 대한 허용을 막음
    public synchronized void methodA() { //메소드A에 대한 동시실행 막는거
        System.out.println("Thread methodA() 작업 실행");
        notify(); //일시 정지 상태에 있는 스레드
        try{
            wait(); // ThreadA를 일시 정지 상태로 만듦
        } catch (InterruptedException e){

        }
    }
    public synchronized void methodB(){
        System.out.println("Thread methodB() 작업 실행");
        notify();//일시 정지 상태에 있는 스레드A를 실행대기로 바꿈
        try{
            wait(); //스레드B를 일시 정지 상태로 만듦
        }catch (InterruptedException e){

        }
    }
}
