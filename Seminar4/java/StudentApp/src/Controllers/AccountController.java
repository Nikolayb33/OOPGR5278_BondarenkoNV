package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Teacher;
import Domain.Worker;

public class AccountController {


    public static <T extends Worker,V> void paySalary(T person, V salar)
    {
        System.out.println(person.getName()  + " выплачена зарплата "+salar);
    }
// add static method for output average age of all Person
    public static <T extends Person> void averageAge(List<Person> listOfPerson){
        Integer sum = 0;
        for (Person person : listOfPerson) {
            sum += person.getAge();
        }
        System.out.println(sum/listOfPerson.size());
    }

    // public void paySalary(Teacher person, int salar)
    // {
    //     System.out.println(person.getName()  + " выплачена зарплата "+salar);
    // }

    // public void paySalary(Student person, int salar)
    // {
    //     System.out.println(person.getName()  + " выплачена зарплата "+salar);
    // }
}
