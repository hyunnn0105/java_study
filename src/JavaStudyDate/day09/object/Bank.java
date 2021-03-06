package JavaStudyDate.day09.object;

public class Bank {
    String bankName;    //은행명

    // 등록된 계좌들
    Account[] accounts;

    // 총 보유금액
    int totalcash;

    //등록된 계좌 수
    int accountCount;

    // 생성자 
    // 배열타입이라서 배열타입 문법사용
    Bank(String bankName, int accountCount) {
        this.bankName = bankName;
        this.accountCount = 0;
        this.accounts = new Account[accountCount];
    }
    
    // 신규계좌 등록기능
    void registry(Account newAccount) {
        // 등록가능 여부판단 : 총 계좌 등록 제한 갯수를 넘지 않았는가
        if (accountCount < accounts.length) {
            accounts[accountCount++] = newAccount;
            System.out.println("신규계좌 등록");
        } else {
            System.out.println(" 더 이상 계좌를 등록할 수 없습니다.");
            return;
        }
    }

    // 등록된 모든 계좌 조회가능
    void showAccount(){
        System.out.printf("===========[%s은행] 등록계좌 (총 %d개) =============\n"
        , this.bankName, this.accountCount);
        // 계좌정보 보여주기
        for (int i = 0; i < this.accountCount; i++) {
            // # 1. 홍길동님 계좌 - 잔액 [10000원]
            // # 2. 김영희님 계좌 - 잔액 [30000원]
            System.out.printf("# %d. %s님 계좌 - 잔액[%d원] \n "
            , i + 1, accounts[i].owner.name, accounts[i].balance);
            /*
                accounts[0] - 첫번째 계좌정보 (account 타입 - accoount 내부 타입에 접근 가능)
                account[0].balence++ = 첫번쨰 계좌의 잔액 정보 (balence의 타입 int)
                accounts[0].money -> 접근불가
                accounts[0].ower = (ower = ower type person); - 첫번쨰 계좌의 예금주 모든 정보
                accounts[0].owner.name = 첫번째 계좌의 예금주 이름

             */
            
        }

    }
}
