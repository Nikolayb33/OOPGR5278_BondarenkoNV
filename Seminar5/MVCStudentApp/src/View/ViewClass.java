package View;

import java.util.List;
import java.util.Scanner;

import Controller.ControllerClass;
import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {

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
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-------------Список студентов------------");
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
        System.out.println("Введите id студента на удаленеие");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        // System.out.println(num);
        return num;
    }
    /*
     * добавляю методы для вывода на Русском языке
     */
    public String enterNextCommand(){
        String a = "Введите команду";
        return a;
    }

    public String listOfStudentsEmpty()
    {
        String a = "Список студентов пуст!";
        return a;
    }

    public String exitFromProgram()
    {
        String a = "Выход из программы";
        return a;
    }

    public String studentNotExist()
    {
        String a = "Нет такого студента";
        return a;
    }



}
