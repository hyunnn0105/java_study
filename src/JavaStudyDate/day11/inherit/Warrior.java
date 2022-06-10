package JavaStudyDate.day11.inherit;


public class Warrior extends Player{
    public int rage; //분노게이지

    public Warrior(String name){
        super(name);
        this.rage = 100;
    }

    public void rush(Player target) {
        System.out.printf("%s님이 %s님에게 FireRush를 시전했습니다!\n"
                , this.name, target.name);
        int damage;
        String job;
        if (target instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (target instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (target instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                , target.name, job, damage);
        System.out.printf("%s님의 현재 체력: %d\n"
                , target.name, target.hp);
        System.out.println();

    }
    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("# range : " + rage);
    }

}


