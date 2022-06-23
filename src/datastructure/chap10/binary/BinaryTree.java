package datastructure.chap10.binary;
class Node{
    private int data; // 트리에 저장할 데이터
    private Node leftChild; // 왼쪽자식
    private Node rightChild; // 오른쪽자식

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return String.format("[ %d ]", data);
    }
}

public class BinaryTree {

    private Node root; // 트리의 루트 노드 - l와 r가 루트저장

    // ================ 삽입 =====================
    public void add(int data){
        // 삽입 데이터 노드 생성
        Node newNode = new Node(data);
        
        // 빈 트리이면 새로운 노드를 루트로 지정
        if (root == null){
            root = newNode;
        } else {
            Node current = root;
            // 부모백업
            Node parent;
            
            while (true){
                //백업
                parent = current;
                // 삽입할 데이터가 타겟노드의 데이터보다 작은경우
                if (data < current.getData()){
                    current = current.getLeftChild();
                } else {
                    // 삽입할 데이터가 타겟노드의 데이터보다 큰경우
                    current = current.getRightChild();
                    if (current == null){
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }
    
    
    
    // ================ 순회 ======================

    // 전위 순회(pre order)
    public void preOrder(Node tempRoot){
        if (tempRoot != null) {
            // 1번출력
            System.out.printf("%d ", tempRoot.getData());
            // 2가 temp 루트가 됨 - 재귀호출 반복
            preOrder(tempRoot.getLeftChild());
            preOrder(tempRoot.getRightChild());
        }
    }

}
