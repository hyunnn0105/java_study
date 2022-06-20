package JavaStudyDate.day19.lambda;

public class Apple {

    // enum - 열거형 타입
    // static 처럼 사용하면 됨 (상수)
    // 안에서만 사용할거라면 내부클래스도 OK
    enum Color {
        RED, GREEN
    }

    private int weight; // 무게
    
    // 어느정도 정해진 글자들은 열거형 사용 가능 - ex) 학점
    // private Color color = Color.GREEN; // 색상
    private Color color; // 색상

    public Apple(){}

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
