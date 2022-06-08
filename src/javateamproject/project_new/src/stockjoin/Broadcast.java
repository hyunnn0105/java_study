package stockjoin;

public class Broadcast {
    // 방송국 // 뉴스의 묶음
    private News[] bArr = new News[6];
//    private final int Size = 6;
//    private Stock tt =  new Stock();

    public Broadcast() {
        bArr[0] = new News("'중국 우한 코로나' 국내 첫 확진…감염경보 '주의' 상향", false);
        bArr[1] = new News("지속되는 코로나 여파로 실내족들 많이늘어 ... ", false);
        bArr[2] = new News("위드코로나 정책으로 햇빛 ", false);
        bArr[3] = new News("'중국 우한4 코로나' 국내 첫 확진…감염경보 '주의' 상향", false);
        bArr[4] = new News("'중국 우한5코로나' 국내 첫 확진…감염경보 '주의' 상향", false);
        bArr[5] = new News("'중국 우한6 코로나' 국내 첫 확진…감염경보 '주의' 상향", false);
    }
//    public Broadcast(Stock[] stocks) {
//        m[0] = new News("'중국 우한 코로나' 국내 첫 확진…감염경보 '주의' 상향", false, stocks[0]);
//        m[1] = new News("'중국 우한 코로나' 국내 첫 확진…감염경보 '주의' 상향", false, stocks[2]);
//        m[2] = new News("'중국 우한 코로나' 국내 첫 확진…감염경보 '주의' 상향", false, stocks[0]);
//        m[3] = new News("'중국 우한 코로나' 국내 첫 확진…감염경보 '주의' 상향", false, stocks[0]);
//        m[4] = new News("'중국 우한 코로나' 국내 첫 확진…감염경보 '주의' 상향", false, stocks[0]);
//        m[5] = new News("'중국 우한 코로나' 국내 첫 확진…감염경보 '주의' 상향", false, stocks[0]);
//    }

    //    뉴스꺼내는 메소드를 만들어야한다 /.
//
//    랜덤으러ㅗ 꺼내던
//            
//            제목으로 꺼내던
//
    public News[] printNews() {
        return bArr;
    }


    // 거래소에 존재하는 거래소 주식 갯수





}
