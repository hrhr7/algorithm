package 쓰레드6;
public class RunThread extends Thread{
    private boolean stop; // stop플래그 생성
    //stop플래그 설정을 위해 setter 메소드 구현
    public void setStop(boolean stop){
        this.stop = stop;

    }
    @Override
    public void run() {
        while(!stop) { //stop중일 때 계속 도는거임
            System.out.println("Thread 실행 중 ...");
        }
        System.out.println("자원 정리 중 ...");
    }
}
