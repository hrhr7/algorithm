package 쓰레드만들기;
//스레드로 상속 받아 쓰레드 구현
//GameThA : 전사 캐릭터 구현
public class GameThA extends Thread{
    //상속줄게 아니라 접근제한자를 private, 외부 접근 허용 막기 위해
    private Character warrior; //참조변수(character) 만든이유는 매개변수 만드려고
    private Character wizard;
    //생성자 만듦 (public 붙여도 되고 안붙여도 됨)
    //생성자 호출시 매개변수로 생성된 캐릭터의 객체를 넘겨 받음
    GameThA(Character warrior, Character wizard) {
        this.warrior = warrior; //매개변수로 넘겨받은 객체를 인스턴스필스 변수에 넘겨줌
       this.wizard = wizard;
    }

    @Override //생략 가능함
    public void run() {
        int normal, special; //일반공격력에 대한 확률변수, 특수공격력에 대한 변수
        boolean endGame = false; //게임 진행 여부 판단하는 플래그
        while(true) { //스레드 무한반복
            try {
                sleep(3000); //게임의 진행속도 맞추기 위해 sleep 사용(3초 대기)
                normal = (int)(Math.random() * 2); //math는 static 함수(확률 50%)
                special = (int)(Math.random() * 20); //5%확률(20분의 1)
                if(normal == 1) { //normal은 0과1만있음
                    System.out.println("물리 공격 : " + wizard.name + " 에게 " + warrior.pAttack() + " 데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                } else {
                    System.out.println("마법 공격 : " + wizard.name + " 에게 " + warrior.mAttack() + " 데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());
                }
                if(special == 10) { //아무 숫자나 넣어도 됨 0~19
                    System.out.println(warrior.name + " 궁극기 발동 !!, " + wizard.name + "에게" + warrior.ultimate() +
                            "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.ultimate());
                }
                if (endGame) System.exit(0); //강제 종료

            } catch (InterruptedException e) {

            }
        }
    }
}
