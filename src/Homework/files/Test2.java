package Homework.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) throws IOException {

// 파일 불러오기
        BufferedReader reader = new BufferedReader(
                new FileReader("C:/intellij/IdeaProjects/java_study/src/Homework/files/stream-data.txt")
        );
        String str;

        // list
        List<String> strArr = new ArrayList<>();

        while ((str = reader.readLine()) != null){
            strArr.add(str);
        }
        reader.close();

        // stream
        Stream<String> stream = strArr.stream();

        List<Integer> integerList = stream.mapToInt(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(integerList);
    }


}
