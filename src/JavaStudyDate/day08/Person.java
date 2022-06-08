package JavaStudyDate.day08;

public class Person {
    String name;
    int age;

    Person (String pName) {
        name = pName;
        if (name.equals("바보")) {
            return;
            // 그냥 리턴(탈출)은 가능, 값을 들고 나가는건 불가능
        } else {
            System.out.println("hi");
        }
    }

    void sleep(){}
}
