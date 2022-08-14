package 쓰레드만들기;
//게임 캐릭터를 만들기 위해 기본 클래스 정의
//게임캐릭터가 가져야 할 필수 요소 포함
//상속을 주기 위해서는 접근제한자는 protected(
public class Unit {
    protected String name;
    protected int pPower;
    protected int mPower;
    protected double pHit;
    protected double mHit;
    protected int ultraPower;
    int hp;
};

interface GameAction {
    double pAttack();
    double mAttack();
    int ultimate();
    boolean setDamage(double damage);
}

