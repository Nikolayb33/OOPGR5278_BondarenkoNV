package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {

    public void printAllStudent(List<Student> students);
    public String prompt(String msg);
// метод для вывода фразы на разных языках и получения номера студента на удаление    
    public int studentNumbertoDelete();
// ниже добавлены методы для вывода на разных языках
    public String enterNextCommand();
    public String listOfStudentsEmpty();
    public String exitFromProgram();
    public String studentNotExist();


}
