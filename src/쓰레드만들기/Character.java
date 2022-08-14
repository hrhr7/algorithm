package 쓰레드만들기;
//실제 게임 캐릭터로 만들어질 클래스
public class Character extends Unit implements GameAction {
    //캐릭터가 가지는 기본적인 능력치를 생성자 통해서 결정 함
        public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp) {
            this.name = name; //this는 자신의 객체를 참조하는 참조 변수
            this.pPower = pP;
            this.mPower = mP;
            this.pHit = pH;
            this.mHit = mH;
            this.ultraPower = ultra;
            this.hp = hp;
        }

    @Override
    //물리 공격력 : 물리적인힘*원래는 확률로 계산하는게 원칙이지만 간단한 코드위해
    public double pAttack() {
        return pPower * pHit;
    }

    @Override
    public double mAttack() {
        return mPower * mHit;
    }

    @Override
    //궁극기 : 특수 능력
    public int ultimate() {
        return ultraPower;
    }

    @Override
    //해당 캐리터가 공격을 받아서 받는 피해량을 반영함
    public boolean setDamage(double damage) {
        if(hp > damage) {
            hp -= damage;
            System.out.println("남아 있는 " + name + "의 체력은 " + hp + "입니다.");
            return false; //false는 캐릭터가 살아있음을 의미함
        } else {
            System.out.println(name + "이 죽었습니다. 게임을 종료 합니다.");
            return true;
        }
    }

    public synchronized void methodA() {
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
    public synchronized void methodB() {
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
}
