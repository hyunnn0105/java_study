package JavaStudyDate.day11.inherit;


import Utility.Util;

public class Mage extends Player{
    public int mana;
    public Mage(String name){
        super(name);
        this.mana = 1000;
    }

    // day06 chap02 참고
    public void blizard(Player... targets){
        System.out.println( name +"님이 얼음폭풍을 시전합니다. ");
        Util.line();
        for (Player p : targets) {
            //맞은사람이 난가? this == 마법사
            if (p == this) continue;
            int damage = (int) (Math.random() * 6 + 10);
            // 실ㅈㅔ 체력 차감..........하ㅏ
            p.hp -= damage;
            //            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.name, damage, p.hp);


        }
    }

    @Override      // 오버라이딩 룰체크 - 시그니처 동일하게
    public void showStatus(){
        super.showStatus();
        System.out.println("# mana : " + mana);
    }



}
