package JavaStudyDate.day11.inherit;


public class Mage extends Player{
    public int mana;
    Mage(String name){
        super(name);
        this.mana = 1000;
    }

    public void blizard(){
        System.out.println( name +"님이 얼음폭풍을 시전합니다. ");
    }
    @Override      // 오버라이딩 룰체크 - 시그니처 동일하게
    public void showStatus(){
        super.showStatus();
        System.out.println("# mana : " + mana);
    }



}
