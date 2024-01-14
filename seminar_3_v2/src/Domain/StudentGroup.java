package Domain;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{

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