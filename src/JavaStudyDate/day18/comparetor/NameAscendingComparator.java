package JavaStudyDate.day18.comparetor;

import java.util.Comparator;

public class NameAscendingComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // compareTo - o1과 02의 아스키코드값 비교해줌
        return o1.getName().compareTo(o2.getName());
    }
}
