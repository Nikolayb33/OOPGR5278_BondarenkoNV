package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student>{
// field
    private int count;
    private List<Student> listSt;
// constructor
    public StudentIterator(List<Student> listSt) {
        this.listSt = listSt;
    }
// method
    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return count < listSt.size();
    }

    @Override
    public Student next() {
        int index = count;
        count++;
        // TODO Auto-generated method stub
        return listSt.get(index);
    }

    

}