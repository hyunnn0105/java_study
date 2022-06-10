package JavaStudyDate.day11.inherit;

// 부모클래스 (superClass)

// Player의 부모 Object;
public class Player extends Object{
    public String name;
     int level;
    public int hp;
    public int exp;



    public Player(String name){
        System.out.println("Player 생성자 호출!");
        this.name = name;
        this.level = 1;
        this.hp = 50;
    }

    public void showStatus() {
        System.out.println("\n======== Character's Info ==========");
        System.out.println("# name : " + name);
        System.out.println("# level : " + level);
        System.out.println("# hp : " + hp);
    }




}
