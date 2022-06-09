package datastructure.chap5.stack;
//노드가 필요행
class StackNode{
    private int item; // 스텍에 저장될 장소
    private StackNode link; // 다음노드를 연결할 포인터

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public StackNode getLink() {
        return link;
    }

    public void setLink(StackNode link) {
        this.link = link;
    }
}

// 실제 구현할 stack
public class Stack {

    // 스택의 맨 위쪽 노드를 가리킬 포인터
    private StackNode top;

    public Stack(){
        top = new StackNode();
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty(){
        // top이 null이면 스택에 값이 없다
        return top.getLink() == null;
    }

    // 스택에 자료 삽입 - 지금삽입되는 숫자 저장
    public void push (int item) {
        StackNode newNode = new StackNode();
        newNode.setItem(item); // 새노드에 데이터 저장
        // 새노드는 기존의 top이 기억하고 있는 노드를 연결
        newNode.setLink(top.getLink());
        top.setLink(newNode); // top은 새로운 노드를 연결
    }
    
    // 스택에서 자료를 제거 -> 제거한 값은 리턴해주기
    // Integer like int
    public Integer pop(){
        if (isEmpty()){
            System.out.println("stack is empty!");
            return null;
        } else {
            // 데이터 가져오기
            int result = top.getLink().getItem();
            
            // top이 제거될 노드의 다음노드를 연결하도록함
            top.setLink(top.getLink().getLink());
            return result;
        }
    }
    public Integer peek(){
        if (isEmpty()) {
            System.out.println("stack is empty!");
            return null;
        } else {
            // 데이터 가져오기
            int result = top.getLink().getItem();
            return result;
        }
    }
}
