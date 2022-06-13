
package JavaStudyDate.day14.abs.pet;
// 애완동물의 공통 클래스
//abs가 절댓값 아닌가?
public abstract class Pet {
    private String name; // 이름
    private String kind; // 종
    private int age; // 나이

    // 생성자
    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    // 먹이를 먹는 기능
    public abstract void feed();
    
    // 낮잠을 자는 기능
    public abstract void takenap();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
