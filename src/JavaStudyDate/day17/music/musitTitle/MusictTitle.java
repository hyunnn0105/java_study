package JavaStudyDate.day17.music.musitTitle;

import JavaStudyDate.day17.music.singer.Singer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MusictTitle {
    // key 명에 가수명?/
/*
    private final Map<Singer,String> saveData;

    /*
        # 있어야 하는 기능
        1. 현재 등록된 가수의 숫자 보여주기

        2. 가수 + 노래 등록하기
        -> 가수 X + 신규 노래 등록 : 신규등록 메세지
            1. 입력받은 가수의 값 가져오기
            2. 입력받은 가수 배열에 추가
        -> 가수 0 + 신규 노래 등록 : 가수님의 노래 목록에 노래이름 추가
            1. 가수배열 호출
            2. 가수의 노래 리스트에 있는지 확인
        -> 가수 0 + 노래 0 : 이미 등록된 노래

        3. 가수 검색
        -> 가수 X : 가수등록X 메세지 출력
        -> 가수 0 : 가수의 노래 목록 보여주기
        4. 
     */
//
//    public MusictTitle() {
//        saveData = new HashMap<>();
//    }

//    public Set<String> convert(list<>){
//
//    }
    // 1. 현재 등록된 가수의 숫자 보여주기
//    public int totalSingerNum(){
//        int totalSingerNum = saveData.size();
//        return totalSingerNum;
//    }
//
//    // 2. 음악, 가수명 추가하기
//    // 추가는 put인데??
//    public void putSinger(Singer targersinger,String musicTitle){
//
//        // 가수가 있는지 확인
//        boolean tf = saveData.containsKey(targersinger);
//
//        if (tf=false){
//            // 없다 - 이건 한번에 노래까지 만들어서 넣어주는거임,,,,
//
//        } else {
//            // 있다 - 해당되는 값 보기
////            if ( saveData.get(musicTitle) = )
//
//        }
//
//        // 추가하는거
//    }

//    public boolean tf(Singer targetName){
//        boolean idx = saveData.containsKey(targetName);
//        return idx;
//    }

//    public void findSinger(Singer targetname){
//        if (idx = false) {
//            // 그럼 가수가 있다
//        } else {
////            System.out.println("# 해당가수는 등록되지 않았습니다.");
//        }
//
//    }
    
    // 저장된거 보여주기
    public void showmusilist(){
        
    }

    /*
         // key는 가수명을 사용
        private final Map<String, Artist> artistMap;

        private static ArtistController ac;
        static {
            ac = new ArtistController();
        }

        private ArtistController() {
            artistMap = new HashMap<>();
        }


        // 싱글턴 객체 반환
        public static ArtistController getInstance() {
            return ac;
        }


        // list를 set으로 변환 -> 객체 추가/검색/삭제가 잘 됨
        public Set<String> convert(List<String> list) {
            Set<String> set = new HashSet<>();
            set.addAll(list);
            return set;
        }

        // 가수 신규 등록 기능
        public void insertNewArtist(Artist artist) {
            artistMap.put(artist.getName(), artist);
        }

        // 등록 가수 노래목록에 노래 추가 기능
        public boolean addNewSong(String artistName, String songName) {
            // 노래 목록 얻기
            List<String> songList = artistMap.get(artistName).getSongs();
            // 중복 확인을 위한 set 변환
            Set<String> songSet = convert(songList);
            // 노래 넣고 결과 얻기
            boolean result = songSet.add(songName);

            // set에 성공적으로 저장되었다면 중복이 아닌 노래이므로 리스트에 저장
            if (result) songList.add(songName);

            // 노래 넣기 성공 유무 결과 반환
            return result;
        }

        // 가수가 등록되어 있는지 유무 확인
        public boolean isRegister(String artistName) {
            return artistMap.containsKey(artistName);
        }

        // 등록된 가수의 수 반환
        public int count() {
            return artistMap.size();
        }

        // 특정 가수 노래 목록 반환
        public List<String> getSongList(String artistName) {
            return artistMap.get(artistName).getSongs();
        }

     */
}
