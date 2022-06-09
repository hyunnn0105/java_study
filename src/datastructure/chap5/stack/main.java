package datastructure.chap5.stack;

public class main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // 스택에 자료넣기
        for (int i = 1; i < 5; i++) {
            stack.push(i*5);
        }
        
        // 스택에서 순서대로 자료들을 제거하면서 출력
        while (!stack.isEmpty()){
            Integer removed = stack.pop();
            System.out.println(removed);
        }
        stack.peek();
    }
}
