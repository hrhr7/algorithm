package 쓰레드6;
//안정적인 스레드 종료 방법 : stop플래그, interrupt()
public class ThreadMainEx6 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
        Thread.sleep(1000);
        runThread.setStop(true);
    }
}
