package datastructure.chap02.linkedlist.Doubly;

public class Node {
    
    private int data; // type과 상관없이 데이터 저장
    
    private Node nextNode; // 다음 노드의 주소
    private Node prevNode; // 이전 노드의 주소
    
    // data 초기화
    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }
}
