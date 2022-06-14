package JavaStudyDate.day15.exception;

public class Account {
    String owner;
    int balance;

    // 만든 에러 넣어주기
    public void withdraw(int money) throws BalanceInsufficientException{
        if (balance < money) {
            // return; // 소극적인 대응 -> 적극 에러만들기
            // throw : 유발하다, 발생하다 -> 에러를 터트리겠당
            throw new BalanceInsufficientException("잔액부족");
        }
        this.balance -= money;
    }
}
