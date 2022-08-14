package 쓰레드1;

public class ThreadMainEx1 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); //객체
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();


    }
}
