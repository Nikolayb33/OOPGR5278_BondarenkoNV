package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
   public List<Student> getStudents();
   /*
    * Добавлен в интерфейс метод удаления студентов и реализован для модели со словарем и списком
    */
   public void deleteStudent(Student studentToDelete);
}
