package datastructure.chap02.linkedlist.Doubly;

public class DoublyLinkedlist {

    private SentinelNode sentinel;
    
    public DoublyLinkedlist() {
        // 만들어서 초기화
        sentinel = new SentinelNode();
    }

    // 리스트에 노드를 추가하는 메서드
    public void add(int data) {
        // 새로운 노드 생성
        Node newNode = new Node(data);
        // 삽입 위치 탐색
        Node current = sentinel.getFirstNode();
        Node prev = null;
        
        // prev 백업 + 위치탐색?
        while (current != null && data > current.getData()) {
            prev = current;
            current = current.getNextNode();
        }
        
        // 링크 처리
        // 빈 리스트인 경우
        if (sentinel.isEmpty()) {
            // 감시노드가 새로운 노드를 기억하도록 설정
            sentinel.setFirstNode(newNode);
            sentinel.setLastNode(newNode);
        }
        // 새로운 노드가 맨 처음 위치에 삽입되는 경우
        // 새로운 노드가 바라보는게 cur과 같은 경우
        else if (sentinel.getFirstNode() == current) {
            // 새로운 노드의 다음 노드로 기존 첫 노드를 설정
            newNode.setNextNode(sentinel.getFirstNode());
            sentinel.setFirstNode(newNode);

        }
        //새로운 노드가 맨 마지막위치에 삽입되는 경우
        else if (current == null) {
            // 이전노드에 뉴노드
            prev.setNextNode(newNode);
            // 값 넣어주기
            newNode.setPrevNode(prev);

            sentinel.setLastNode(newNode);

        }
        // 새로운 노드가 중간 위치에 삽입되는 경우
        else {
            newNode.setNextNode(current);
            newNode.setPrevNode(prev);
            // 새로운 노드의 다음 노드로 기존 첫 노드를 설정
            prev.setNextNode(newNode);
            current.setPrevNode(newNode);

        }


    }

    // 리스트에서 노드를 삭제하는 메서드
    public Node remove(int data) {

        Node current = sentinel.getFirstNode();
        Node prev = null;
        
        // 역방향 탐색은 위치 바꾸면서 이전으로 돌리기
        while (current != null && data != current.getData()) {
            prev = current;
            current = current.getNextNode();
        }

        // 삭제 대상이 맨 첫번째 노드인 경우 =====================
        // 감시모드가 감시하던 대상이 cur == 첫번째 노드 삭제
        // 기존의 두번째노드의 이전 노드를 null
        // 기존의 두번째노드 == curNext
        if (sentinel.getFirstNode() == current) {
            // 기존의 두번째 노드의 이전노드를 null로
            Node secondNode = current.getNextNode();
            // 현재의 다음 노드의
            secondNode.setPrevNode(null);
            // 감시노드의 첫번째 노드를 기존의 두번째 노드로 설정
            sentinel.setFirstNode(secondNode);
        }

        // 삭제 대상이 마지막 노드인 경우
        // 삭제대상이 마지막인 경우 ===================
        // cur.nextnode = null
        // 마지막 노드를 이전 노드인 prv로 변경


        else if (current.getNextNode() == null) {
            prev.setNextNode(null);
            sentinel.setLastNode(prev);
        }

        // 삭제 대상이 중간 노드인 경우
        // prev : 100 / cur : 200 / cur.getnextnode() : 300
        else {
            // prev : 100번지, current : 200번지,
            // current.getNextNode() : 300번지
            
            // prev의 다음노드 링크 자리를 현재의 다음 링크로 변경
            prev.setNextNode(current.getNextNode());
            // 300번지의 이전노드 링크 변경
            current.getNextNode().setPrevNode(prev);
        }

        return current;
    }

    // 리스트를 전체 순회하여 완성된 문자열로 반환
    public String printList() {
        String str = "[ ";
        Node current = sentinel.getFirstNode();

        while (current != null) {
            str += current.getData();
            current = current.getNextNode();

            if (current != null) {
                str += ", ";
            }
        }
        str += " ]";
        return str;
    }







    
}
