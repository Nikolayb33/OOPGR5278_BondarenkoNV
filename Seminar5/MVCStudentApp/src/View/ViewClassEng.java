package View;

import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClassEng implements iGetView{

    /*
     * добавляем поле contr из интерфейса iGetController
     */
    
    private iGetController contr;

    /*
    * метод
    */
    public void setContr(iGetController contr) {
        this.contr = contr;
    }

    /*
    * метод из интерфейса iGetView, выводящий  консоль студентов
    */
    
    public void printAllStudent(List<Student> students) {
        System.out.println("-------------List of students------------");
        for(Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }
    
    /*
    * метод из интерфейса iGetView
    */
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    /*
    * метод из интерфейса iGetView запускающий программу в клиентском коде
    */
    public void ViewRun()
    {
        contr.run();
    } 

    /*
    * метод из интерфейса iGetView запрашивающий номер студента на удаление
    */
    
    public int studentNumbertoDelete(){
        System.out.println("Enter id of student for delete");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    /*
     * добавляю методы для вывода на Английском языке
     */
    public String enterNextCommand(){
        String a = "Enter next command";
        return a;
    }

    public String listOfStudentsEmpty()
    {
        String a = "List of students empty";
        return a;
    }

    public String exitFromProgram()
    {
        String a = "Exit from the program";
        return a;
    }

    public String studentNotExist()
    {
        String a = "Student doesn`t exist";
        return a;
    }

}   
    
