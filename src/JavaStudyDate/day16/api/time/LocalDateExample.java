package JavaStudyDate.day16.api.time;

import Utility.Util;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class LocalDateExample {
    public static void main(String[] args) {
        // 얘도 안쓰는게 좋다
//        Calendar cal = Calendar.getInstance();

        // 현재 날짜 정보 얻기(연,월,일) - 시스템 기준
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 현재 시간 정보 얻기 (시,분,초)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        
        // 현재 날짜와 시간 정보 얻기(연,월,일,시,분,초)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        
        // 특정 날짜와 시간 정보 얻기
        LocalDateTime startDay = LocalDateTime.of(2022,7,9,0,0);
        System.out.println("startDay = " + startDay);

        // 연도 추출하기
        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        // 월
        int month = localDateTime.getMonthValue();
        System.out.println(month);

        //JUNE
//        Month month1 = localDateTime.getMonth();
//        System.out.println(month);
        
        // localDateTime.getDayOfYear();
        
        // 지금으로부터 3일 뒤(시스템적으로)
         LocalDateTime three = localDateTime.plusDays(3);
        System.out.println("three = " + three);
        
        // 패키지 대소 구분
        // 대문자.스테틱
        // 소문자.인스턴스
        
        // 지금부터 1년 2개월 7일 뒤
        LocalDateTime d1 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);
        System.out.println(d1);

        // 지금부터 3년 2개월전 - 와 고3때다
        LocalDateTime d2 = localDateTime.minusYears(3).minusMonths(2);
        System.out.println("d2 = " + d2); // 2019-04-15T15:15:02.023234700
        
        // 사이날짜 연산 (Date는 년/월/일)
        LocalDate a = LocalDate.of(2020,12,30);
        LocalDate b = LocalDate.of(2022,9,15);
        long cal = ChronoUnit.DAYS.between(a,b);
        System.out.println("cal = " + cal); // 624일~~~

        Util.line();

        // 날짜 포맷 변경하기
        System.out.println(localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월d일 a hh시 m분");
        // a = 오전/오후 : 올려보면 양식 있음
        System.out.println(localDateTime.format(dtf));

    }
}
