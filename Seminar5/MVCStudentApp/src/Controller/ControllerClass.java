package Controller;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

public class ControllerClass implements iGetController {

    private iGetModel model;
    private iGetView view;
    private List<Student> studBuffer = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean tesdData(List<Student> stud)
    {
        if(stud.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update(String Request)
    {
        //MVP
        studBuffer = model.getStudents();
        if(tesdData(studBuffer))
        {
            view.printAllStudent(studBuffer);
        }
        else
        {
            System.out.println(view.listOfStudentsEmpty());
        }

        //MVC
        //view.printAllStudent(model.getStudents());
    }
    

    public void run()
    {
        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt(view.enterNextCommand());
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                   getNewIter = false;
                   System.out.println(view.exitFromProgram());
                   break;
                case LIST:
                   view.printAllStudent(model.getStudents());
                   break; 
                /* Добавлен метод delete 
                 */   
                case DELETE:
                    for(Student s: model.getStudents()){
                        studBuffer.add(s);
                    }
                    Integer studentNumber = view.studentNumbertoDelete();
                    boolean flag = true;
                    
                    //хотел через исключение вывести отсутствие
                    // студента в списке, но не подобрал нужное 
                    
                    for (Student s: studBuffer){
                        if (s.getId() == studentNumber){
                            model.deleteStudent(s);
                            flag = false;
                        } 
                    }
                    if (flag == true){
                        System.out.println(view.studentNotExist());
                    }  
                    break;


            }
        }
    }
}
