
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.Employee;
import Domain.Person;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;
import Services.iPersonService;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }


        Teacher t1 = new Teacher("Эдуард", 50, "Доцент");
        Employee e1 = new Employee("Федор", 35, "Дворник");

       // AccountController controller = new AccountController();
       // controller.paySalary(t1, 50000);
        //controller.paySalary(e1, 25000);

        //controller.paySalary(s1, 20000);
        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(e1, 50000);
        //AccountController.paySalary(s1, 50000);
        System.out.println("=========================================================");
// hw4_1
        Teacher t10 = new Teacher("Иван Иваныч", 45, "phd");
        Teacher t11 = new Teacher("Игорь Игоревич", 43, "phd");
        Teacher t12 = new Teacher("Иван Игоревич", 42, "phd");
        Teacher t13 = new Teacher("Игорь Иванович",  53, "phd");
        Teacher t14 = new Teacher("Дарья Ивановна",  73, "phd");
        Teacher t15 = new Teacher("Елена Игоревна",  63, "phd");

        // Teacher.getAll();

        System.out.println("=========================================================");
// hw4_2
        List<Person> listOfPerson_1 = new ArrayList<>();
        listOfPerson_1.add(e1);
        listOfPerson_1.add(t1);

        AccountController.averageAge(listOfPerson_1);

    }
}
