package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

/*
 * модель для хранения данных типа List
 */
public class ModelClass implements iGetModel {

/*
 * список студентов
 */
    private List<Student> students;
/*
 * конструктор
 */
    public ModelClass(List<Student> students) {
        this.students = students;
    }
/*
 * метод возвращающий студентов
 */
    public List<Student> getStudents()
    {
        return students;
    }
/*
 * метод удаляющий студента из списка
 */
    public void deleteStudent(Student studentToDelete){
        students.remove(studentToDelete);
    }
    
}
