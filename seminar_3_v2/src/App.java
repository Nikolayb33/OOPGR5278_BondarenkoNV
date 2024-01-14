import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;

public class App {
    public static void main(String[] args) throws Exception {
        Student st1 = new Student("Вася", 21) ;
        Student st2 = new Student("Гена", 21) ;
        Student st3 = new Student("Петя", 21) ;


        List<Student> listSt = new ArrayList<>();

        listSt.add(st2);
        listSt.add(st1);
        listSt.add(st3);

        StudentGroup groupSt = new StudentGroup(listSt, 1);

        // иттерируемся (студенты : из группы)
        for (Student std : groupSt) {
            System.out.println(std);
            
        }
        // раздел
        System.out.println("=========================================================");


        // 
        Collections.sort(groupSt.getGroup());
        
        for(Student std: groupSt.getGroup())
        {
            System.out.println(std);
        }
    }
}
