package 쓰레드만들기;
//마법사 스레드 만들기
public class GameThB extends Thread {
    private Character warrior;
    private Character wizard;

    GameThB(Character warrior, Character wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }
    @Override
    public void run() {
        int normal, special;
        boolean endGame = false;
        while (true) {
            try {
                sleep(3300);
                normal = (int) (Math.random() * 2);
                special = (int) (Math.random() * 18);
                if (normal == 1) {
                    System.out.println("물리 공격 : " + warrior.name + " 에게 " + wizard.pAttack() + " 데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                } else {
                    System.out.println("마법 공격 : " + warrior.name + " 에게 " + wizard.mAttack() + " 데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                }
                if (special == 14) {
                    System.out.println(wizard.name + " 궁극기 발동 !!, " + warrior.name + "에게" + wizard.ultimate() +
                            "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.ultimate());
                }
                if (endGame) System.exit(0);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
