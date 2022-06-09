package JavaStudyDate.day12.static_.singleton;

// 싱글톤 디자인 패턴 구현
public class Controller {
    public int number;

    //2.
    private static Controller con;

    static{
        con = new Controller();

    }

    //1.
    private Controller(){
    }

    // 3.
    public static Controller getInstance(){
        if (con!=null) return con;
        return new Controller();
    }
}
