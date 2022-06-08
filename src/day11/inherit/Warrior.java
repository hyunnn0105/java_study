package day11.inherit;


public class Warrior extends Player{
    public int rage; //분노게이지

    public Warrior(String name){
        super(name);
        this.rage = 100;
    }

    public void rush() {
        System.out.println(name + "님이 돌진합니다.");
    }
    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("# range : " + rage);
    }

}


