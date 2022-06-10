package JavaStudyDate.day13.poly.playerQuiz;

import JavaStudyDate.day11.inherit.Hunter;
import JavaStudyDate.day11.inherit.Mage;
import JavaStudyDate.day11.inherit.Warrior;
// day11-inherit.
public class Main {
    public static void main(String[] args) {
        Mage m = new Mage("눈보라왕");
        Warrior w = new Warrior("워리어");
        Hunter h = new Hunter("헌터");


         m.blizard(w);
    
//        w.rush(m); 
        // 1명씩 + 직업별로 조건 다름(마/20 : 헌/15 : 워/10)
    
    }

}
