package Services;
import Domain.Teacher;
import Domain.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher>{
    //field
    private int count;
    private List<Teacher> teachers;
    // constructor
    public TeacherService() {
        teachers = new ArrayList<>();
    }
    // output list of teachers
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    // create new teacher and add to list with base degree (phd) 
    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, "phd");
        count++;
        teachers.add(teach);
        sortByFIO();
       
    }
    // sort by FIO
    private void sortByFIO() {
        PersonComparator<Teacher> teachComp = new PersonComparator<>();
        teachers.sort(teachComp);
    }
    


    
    
}
