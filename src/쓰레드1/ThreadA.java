package 쓰레드1;

public class ThreadA extends Thread{
    private WorkObject workObject; //워크오브젝트라는거에 참조변수 만듦

    //생성자 만듦
    public ThreadA(WorkObject workObject){
        this.workObject = workObject;
    }
    @Override
    public void run() { //메소드
        for(int i =0; i<10;i++) {
            workObject.methodA();
        }

    }
}
