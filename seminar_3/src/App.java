import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Student st1 = new Student("Вася", 21) ;
        Student st2 = new Student("Гена", 22) ;
        Student st3 = new Student("Петя", 23) ;
        Student st4 = new Student("Женя", 24) ;
        Student st5 = new Student("Сеня", 25) ;
        Student st6 = new Student("Вика", 21) ;


        List<Student> listSt1 = new ArrayList<>();

        listSt1.add(st2);
        listSt1.add(st1);
        listSt1.add(st3);

        List<Student> listSt2 = new ArrayList<>();

        listSt2.add(st4);
        listSt2.add(st6);
        //listSt2.add(st5);

        StudentGroup groupSt1 = new StudentGroup(listSt1, 1);
        StudentGroup groupSt2 = new StudentGroup(listSt2, 2);

        // создаем список групп
        List<StudentGroup> listOfStGroup1 = new ArrayList<>();

        listOfStGroup1.add(groupSt2);
        listOfStGroup1.add(groupSt1);


        // создаем поток студентов

        StudentSteam steamOfSt1 = new StudentSteam(listOfStGroup1, 1);

        // иттерируемся (списки студентов : из потока)
        for (StudentGroup stdGroup : steamOfSt1){
            System.out.println(stdGroup);
        }

        //
        //3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству
        // студентов в группе) и отсортировать группы студентов в потоке, а затем вывести в консоль
        
        // группы отсортированы по количеству студенов
        // чем больше студентов группе тем выше в очереди
        // если равное количество студентов то чем меньше id группы тем выше в очереди
        Collections.sort(steamOfSt1.getListOfGroup());
        //раздел
        System.out.println("=========================================================");

        for (StudentGroup stdGroup : steamOfSt1){
            System.out.println(stdGroup);
        }

    }
}