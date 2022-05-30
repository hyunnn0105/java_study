package datastructure.chap02.linkedlist.singly;
// 단방향 단순 연결리스트
public class SimpleLinkedList {

    //연결리스트는 언제나 헤더노드같은 감시노드를 갖고 있어야함
    private HeaderNode header;

    //생성자의 역할
    public SimpleLinkedList(){
        // 연결리스트가 처음 생성 됐을때, 헤더노드도 같이 생성
        // 헤더노드 생성 -> firstNode = null로 생성
        // bec. 처음 노드 감시하도록 생성
        this.header = new HeaderNode();
    }
    // 리스트의 첫번째 위치(0번idx)로 노드를 삽입하는 메서드
    // public object add - 였더니 오류났음
    // 얘는 리턴 필수인가
    public void addfirst(int data) {

//        System.out.printf("신규데이터 %d 맨 앞에 추가\n", data);


        // 새롭게 추가할 정수 데이터를 신규 노드에 저장
        Node newNode = new Node(data);
//        System.out.printf("새로운 노드의 주소 : %s\n", newNode);

        // 새로운 노드에게 기존의 첫번째 노드의 주소를 저장
        Node oldFirstNode = header.getFirstNode(); // 기존의 첫번쨰 노드 주소 획득
//        System.out.printf(" 헤더가 감시하던 기존 첫번째 노드의 주소:%s\n", oldFirstNode);

        newNode.setNextNode(oldFirstNode); // 그 주소를 새로운 첫번째노드의 다음노드로 설정
//        System.out.printf("새로운 노드가 감시할 다음 노드 주소: %s\n", newNode.getNextNode());

        // header노드에게 새롭게 추가될 노드의 주소를 저장
        // 변수에는 객체의 주소 저장
        header.setFirstNode(newNode);
//        System.out.printf("헤더가 새롭게 감시할 첫번째 노드의 주소: %s\n", header.getFirstNode());
    }


    // 리스트의 첫번째 노드 삭제
    // => 상식 > 삭제하면 바로바로 리턴해주자
    public Node removeFirst() {
        // 빈 리스트 인지 확인 - header node
        if (!header.isEmpty()) {
            // 삭제 대상 노드 keeping
            Node tempNode = header.getFirstNode();

            // 삭제 대상노드의 다음 노드 주소 가져오기
            Node nextNode = tempNode.getNextNode();

            //header node가 다음노드를 감시하도록 설정
            header.setFirstNode(nextNode);

            // 삭제된 노드를 반환
            return tempNode;

        } else {
            return null;
            // 빈 리스트면 null return
        }
    }

    // 정렬된 리스트에서 특정위치에 노드 삽입
    public void insert(int data) {

        // 새로운 노드 생성
       Node newNode = new Node(data);

       // 첫 번째 노드를 가져와서 현재 노드로 설정
       Node current = header.getFirstNode();
       // 바로 이전 노드 가져오기 - 큰애 이전의 노드를 바꿔야함
        Node prev = null;

        // 새로만든 노드 삽입위치 탐색
        // 빈리스트x && 삽입할데이터가 현재노드의 데이터보다 클 동안 반복
        // data > current.getData() - false 나와야함
        while (current != null && data > current.getData()) {
            // 현재 노드를 이전노드에 백업
            prev = current;
            // 다음노드를 현재 노드로 재설정
            current = current.getNextNode();
        }

        // if(빈리스트일 경우)
        if (prev == null) {
            // 새로운 노드를 첫번째 노드로 설정
            header.setFirstNode(newNode);
        }
        // 빈리스트가 아닌경우
        else {
            // 이전노드가 새로운 노드를 다음 노드로 설정
            prev.setNextNode(newNode);
        }
        // 새로운 노드가 다음 노드(current)를 가르키도록 설정
        newNode.setNextNode(current);
    }

    //정렬된 리스트에서 특정 위치 노드 삭제
    public Node remove(int data) {
        // current 노드가 현재값
        Node current = header.getFirstNode();
        // 바로 이전 노드 가져오기
        Node prev = null;

        // 노드 삭제위치 탐색
        // 빈리스트x && 삽입할데이터가 현재노드의 데이터와 다를동안
        // data > current.getData() - false 나와야함
        while (current != null && data != current.getData()) {
            // 현재 노드를 이전노드에 백업
            prev = current;
            // 다음노드를 현재 노드로 재설정
            current = current.getNextNode();
        }
        //첫번째노드인 경우 헤더의 감시대상바꾸기
        if (prev == null && current != null) {
            // 헤더가 기존의 두번째 노드를 감시하도록 설정
            Node secondNode = header.getFirstNode().getNextNode();
            header.setFirstNode(secondNode);
            // or current.getnextNode

        }
        // 삭제대상이 중간 어딘가인 경우
        else if (prev != null && current != null) {
            // 삭제대상의  이전노드가 삭제대상의 다음노드를 연결
            prev.setNextNode(current.getNextNode());
        }
        return current;
    }
    // 리스트를 전체 순회하여 완성된 문자열로 반환
    public String printList(){
        String str = "[ ";
        Node current = header.getFirstNode();

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
