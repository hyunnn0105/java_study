package datastructure.chap02.linkedlist.singly;
// 자료 + 포인터로 이루어짐
// 정수저장 리스트의 노드
public class Node<E> {
    // 노드에 저장할 자료
    private E data;
    // 다음 노드의 주소를 저장할 포인터
    private Node<E> nextNode; // null -> 다음번 값이 생길떄 초기화

    
    //생성자
    public Node(E data) {
        this.data = data;
    }

    // 노드에 저장된 데이터를 가져오는 메서드 getD
    public E getData() {
        return data;
    }

    // 노드에 저장된 데이터 값을 변경하는 메서드 setD
    public void setData(E data) {
        this.data = data;
    }

    //다음노드의 주소를 가져오는 메서드
    public Node<E> getNextNode() {
        return nextNode;
    }

    //다음노드의 주솟값변경
    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
}
