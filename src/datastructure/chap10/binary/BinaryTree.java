package datastructure.chap10.binary;

import java.util.Stack;

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
                if (data < current.getData()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else { // 큰 경우
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }

                /*
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

                 */
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

    // 중위순회 (in order) - 전중후
    public void inOrder(Node tempRoot){
        if (tempRoot != null) {
            preOrder(tempRoot.getLeftChild());
            // 1번출력
            System.out.printf("%d ", tempRoot.getData());
            // 2가 temp 루트가 됨 - 재귀호출 반복
            preOrder(tempRoot.getRightChild());
        }
    }


    // 후위 순회 (post order) - 전후중
    public void postOrder(Node tempRoot) {
        if (tempRoot != null) {
            postOrder(tempRoot.getLeftChild());
            postOrder(tempRoot.getRightChild());
            System.out.printf("%d ", tempRoot.getData());
        }
    }


    public Node find(int targetData){
        Node current = root;
        while (true){
            if (current == null) return null; // 탐색실패
            // 찾는 값이 현재의 노드보다 작은경우
            if (targetData < current.getData()){
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }

            // 탐색성공
            return current;
        }


    }

    // 최대값 찾기
    public Node findMin(){
        // 루트 확인
                if (isEmpty()) return null;

        Node current = root;
        while (current.getLeftChild() != null){
            current = current.getLeftChild();
        }
        return current;

    }

    // 최소값 찾기
    public Node findMax(){
                if (isEmpty()) return null;

        Node current = root;
        while (current.getRightChild() != null){
            current = current.getRightChild();
        }
        return current;
    }

    // ============================= 삭제 ===============================

    public boolean delete(int targetData){
        // 삭제노드와 해당 삭제노드의 부모노드를 탐색
        Node current = root;
        Node parent = current;
        
        while (targetData != current.getData()){
            if (current == null) return false;
            
            parent = current;
            if (targetData < current.getData()){
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        
        // 삭제 진행 - 3가지 분기점
        // 삭제 대상노드의 자식이 없는 경우
        if (current.getLeftChild() == null
                && current.getRightChild() == null){
            // 루트가 삭제대상
            if (current == root) {
                root = null;
            } else if (parent.getRightChild() == current) {
                // 삭제 대상이 부모의 오른쪽 자식이였다면
                parent.setRightChild(null);
            } else{
                parent.setLeftChild(null);
            }

        }
        // 삭제대상노드의 자식이 하나인 경우 - 왼쪽자식인 경우
        else if (current.getRightChild() == null){
            // 삭제 대상이 루트
            if (current == root) {
                root = current.getLeftChild();
                // 삭제대상이 부모의 왼쪽 자식일 경우
            } else if (current == parent.getLeftChild()) {
                // 부모의 새로운 왼쪽 자식으로 삭제대상의 자식을 연결
                parent.setLeftChild(current.getLeftChild());
                // 삭제대상이 부모의 오른쪽 자식인경우
            } else {
                // 부모의 새로운 오른쪽 자식으로 삭제대상의 자식을 연결
                parent.setRightChild(current.getRightChild());

            }
        }

        // 삭제대상노드의 자식이 하나인 경우 - 오른쪽 자식인 경우 ===== 놓쳤다
        else if (current.getLeftChild() == null) {
            // 삭제 대상이 루트
            if (current == root) {
                root = current.getLeftChild();
                // 삭제대상이 부모의 왼쪽 자식일 경우
            } else if (current == parent.getLeftChild()) {
                // 부모의 새로운 왼쪽 자식으로 삭제대상의 자식을 연결
                parent.setLeftChild(current.getLeftChild());
                // 삭제대상이 부모의 오른쪽 자식인경우
            } else {
                // 부모의 새로운 오른쪽 자식으로 삭제대상의 자식을 연결
                parent.setRightChild(current.getRightChild());

            }
        }

        // ***삭제대상 노드의 자식이 둘인경우
        // 후보노드 찾기! : 삭제될 노드보다 큰 키값을 가진 노드 중 가장 작은 키 값을 갖는 노드
        else {
            // 삭제노드보다 큰 애들중ㅇㅔ서 가장 작은애들 찾기
            Node candidate = getCandidate(current);

            if (current == root){
                root = candidate;

            } else if (current == parent.getLeftChild()){
                parent.setLeftChild(candidate);
            } else {
                parent.setRightChild(candidate);
            }
            // 삭제노드의 왼쪽 자식을 후보노드의 왼쪽 자식으로 연결 
            candidate.setLeftChild(current.getLeftChild());
        }

        return true;
    }

    // 후보노드 찾기 - 삭제노드가 부모의 오른쪽 자식인가 왼쪽 자식인가??
    // : 삭제될 노드보다 큰 값을 가진 노드(오른쪽) 중 가장 작은 키 값을 갖는 노드(왼쪽)
    /*
        private Node getCandidate(Node deleteNode){
        // 삭제노드보다 큰 애들중ㅇㅔ서 가장 작은애들 찾기
        // 3-2에서 사용
        Node candidateParent = deleteNode;
        Node candidate = deleteNode.getRightChild();

        // 후보노드는 삭제노드의 오른쪽 자식중에 가장 왼쪽 끝에있는 자식
        while (candidate.getLeftChild() != null){
            candidate = candidate.getLeftChild();
        }
        if ()
        return candidate;
    }
     */


    // 후보 노드 찾기
    private Node getCandidate(Node deleteNode) {

        Node candidateParent = deleteNode;
        Node candidate = candidateParent.getRightChild();

        // 삭제노드 오른쪽 자식의 왼쪽 자식 찾기
        while (candidate.getLeftChild() != null) {
            candidateParent = candidate;
            candidate = candidate.getLeftChild();
        }

        // 후보노드가 삭제노드 왼쪽자식일 때
        if (candidate != deleteNode.getRightChild()) {
            candidateParent.setLeftChild(candidate.getRightChild());
            candidate.setRightChild(deleteNode.getRightChild());
        }

        return candidate;
    }


    // 빈트리인지 확인 ** 수정하자 -> 수정 완료료
    public boolean isEmpty(){
        return root == null;
    }


    public Node getRoot() {
        return root;
    }

    //================= 트리 출력 ======================//
    public void display() {
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);

        int blank = 32;
        boolean isRowEmpty = false;

        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;

            for (int i = 0; i < blank; i++) {
                System.out.print(" ");
            }

            while (!globalStack.isEmpty()) {
                Node temp = globalStack.pop();

                if (temp != null) {
                    System.out.print(temp.getData());
                    localStack.push(temp.getLeftChild());
                    localStack.push(temp.getRightChild());

                    if (temp.getLeftChild() != null || temp.getRightChild() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("**");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int i = 0; i < blank * 2 - 2; i++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            blank /= 2;

            while (!localStack.isEmpty()) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println();
    }
    
    
    
    
    
}
