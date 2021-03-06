package JavaStudyDate.day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {
//        loadTextfile();
        loadObject();

        for (Human h : humanList) {
            System.out.println(h);
        }

    }
    // 세이브파일 불러와서 리스트에 넣기
    static void loadObject(){
        try(ObjectInputStream ois
                    = new ObjectInputStream(new FileInputStream("C:/exercise/human.sav"))){

            // 다운캐스팅 해주기
            humanList = (List<Human>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void loadTextfile(){
        try(BufferedReader br =
                    new BufferedReader(new FileReader("C:/exercise/human.txt"))){

            String s = "";
            while ((s = br.readLine()) != null) {
                s = br.readLine();
                StringTokenizer st = new StringTokenizer(s,",");
                Human human = new Human(st.nextToken()
                        ,Integer.parseInt(st.nextToken())
                        ,st.nextToken()
                );
                humanList.add(human);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
