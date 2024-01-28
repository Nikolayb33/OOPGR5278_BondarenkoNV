package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

/*
 * модель для хранилища данных типа HashMap
 */
public class ModelClassHash implements iGetModel{

/*
* создали хранилище типа 
* HashMap<Integer, Student>
*/    
    private HashMap<Integer, Student> students;
    // private List<Student> students_lt = new ArrayList<>();
    /*
    * создали хранилище типа HashMap<Integer, Student>
    */
    public ModelClassHash(HashMap<Integer, Student> students) {
        this.students = students;
    }
/*
 * добавили метод из подключенного интерфейса
 */ 
    public List<Student> getStudents() {
        List<Student> st = new ArrayList<>(students.values());
        return st;
    }
/*
 * метод удаляющий студента из списка
 */
    public void deleteStudent(Student studentToDelete){
        students.remove(studentToDelete.getId());
        }
    }


    

