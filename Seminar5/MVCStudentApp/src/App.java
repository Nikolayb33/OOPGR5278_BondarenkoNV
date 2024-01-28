import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassHash;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 25);
        Student student3 = new Student("Vasya", 22);
        Student student4 = new Student("Nastya", 27);
        Student student5 = new Student("Vasilisa", 26);
        Student student6 = new Student("Karina", 25);
        Student student7 = new Student("Andrey", 22);
        Student student8 = new Student("Masha", 27);
        Student student9 = new Student("Irina", 28);
        Student student10 = new Student("Nikolay", 30);


// hw5

        HashMap<Integer, Student> studHash = new HashMap<>();
        
        studHash.put(student1.getId(), student1);
        studHash.put(student2.getId(), student2);
        studHash.put(student3.getId(), student3);
        studHash.put(student4.getId(), student4);
        studHash.put(student5.getId(), student5);
        studHash.put(student6.getId(), student6);
        studHash.put(student7.getId(), student7);
        studHash.put(student8.getId(), student8);
        studHash.put(student9.getId(), student9);
        studHash.put(student10.getId(), student10);

        
        iGetModel model = new ModelClassHash(studHash);
        ViewClass view = new ViewClass();

        ControllerClass controller = new ControllerClass(model, view);

        view.setContr(controller);
        view.ViewRun();




// seminar5
        
        // List<Student> studList = new ArrayList<>();
        // studList.add(student1);
        // studList.add(student2);
        // studList.add(student3);
        // studList.add(student4);
        // studList.add(student5);
        // studList.add(student6);
        // studList.add(student7);
        // studList.add(student8);
        // studList.add(student9);
        // studList.add(student10);

        // iGetModel model2 = new ModelClass(studList);
        // ViewClassEng view2 = new ViewClassEng();

        // ControllerClass controller = new ControllerClass(model2, view2);
        // view2.setContr(controller);
        // view2.ViewRun();
    }
}