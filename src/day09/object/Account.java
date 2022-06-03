package day09.object;
// 계좌 class

public class Account {
    String bankName; // 은행명
    int balance; // 예금잔액
    // 예금주 정보
    Person owner;

    // 생성자
    Account(Person p) {
        // 이 통장의 주인 어쩌구
        this.owner = p;
    }

    public int getBalance() {
        return balance;
    }

}
