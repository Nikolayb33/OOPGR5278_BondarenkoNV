package Domain;
import java.util.Iterator;
import java.util.List;


public class GroupIterator implements Iterator<StudentGroup>{

    // field
    private int count;
    private List<StudentGroup> listOfGroup;
    

    // constructor
    public GroupIterator(List<StudentGroup> listOfGroup) {
        this.listOfGroup = listOfGroup;
    }


    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return count < listOfGroup.size();
    }


    @Override
    public StudentGroup next() {
        // TODO Auto-generated method stub
        int index = count;
        count ++;
        return listOfGroup.get(index);
    }
    

    
}
