package JavaStudyDate.day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {
        humanList.add(new Human("김철수",22,"서울시 구로구"));
        humanList.add(new Human("박영희",30,"서울시 금천구"));
        humanList.add(new Human("홍길동",40,"서울시 중구"));

//        saveTextFile();
        saveObject();

    }
    
    // 객체 save 기능 
    static void saveObject(){
        // 리스트를 통채로 넘김
        try (ObjectOutputStream oos
                     = new ObjectOutputStream(new FileOutputStream("C:/exercise/human.sav"))){
            oos.writeObject(humanList);
            // .NotSerializableException 객체 직렬화가 필요하다?
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // 세이브 기능** database
    static void saveTextFile(){
        try(FileWriter fw = new FileWriter("C:/exercise/human.txt")){

            StringBuilder sb = new StringBuilder();
            for (Human h : humanList) {
                fw.write(String.format("%s,%d,%s\r\n", h.getName(), h.getAge(), h.getAddress()));
            }
            System.out.println("저장 완료!");



        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
