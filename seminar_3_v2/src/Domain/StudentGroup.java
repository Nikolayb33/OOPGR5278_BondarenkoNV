package Domain;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{

    // field
    private List<Student> group;
    private int idGroup;

    // constructor
    public StudentGroup(List<Student> group, int idGroup){
        this.group = group;
        this.idGroup = idGroup;
    }


    // getter and setter
    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }


    public int getIdGroup() {
        return idGroup;
    }


    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getSizeOfGroup(){
        return group.size();
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }


    @Override
    public Iterator<Student> iterator() {
        // TODO Auto-generated method stub
        return new StudentIterator(group);
    }


    // группы отсортированы по количеству студенов
        // чем больше студентов в группе тем выше в очереди
        // если равное количество студентов то чем меньше id группы тем выше в очереди
    @Override
    public int compareTo(StudentGroup o) {
        // TODO Auto-generated method stub
        System.out.println(getIdGroup() + " - " + o.getIdGroup());
        if(getSizeOfGroup() == o.getSizeOfGroup()){
            if (idGroup == o.idGroup) return 0;
            if (idGroup > o.idGroup) return 1;
            else return -1;
        }
        if(getSizeOfGroup() < o.getSizeOfGroup())
        return 1;
        else
        return -1;
    }


// переписали в отдельном классе StudentIterator(можно убрать что написано ниже)
    // @Override
    // public Iterator<Student> iterator() {
    //    return new Iterator<Student>() {

    //     private int counter;

    //     @Override
    //     public boolean hasNext() {

    //         if(counter<group.size())
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             return false;
    //         }            
    //     }

    //     @Override
    //     public Student next() {            
    //         return group.get(counter++);
    //     }
        
    //    };
        
    // }
    

    
}