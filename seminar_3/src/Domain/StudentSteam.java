package Domain;
import java.util.Iterator;
import java.util.List;


public class StudentSteam implements Iterable<StudentGroup>{
    // field
    private List<StudentGroup> listOfGroup;
    private int numOfSteam;
    

    // constructor
    
    public StudentSteam(List<StudentGroup> listOfGroup, int numOfSteam) {
        this.listOfGroup = listOfGroup;
        this.numOfSteam = numOfSteam;
    }


    public List<StudentGroup> getListOfGroup() {
        return listOfGroup;
    }


    public void setListOfGroup(List<StudentGroup> listOfGroup) {
        this.listOfGroup = listOfGroup;
    }


    public Integer getNumOfSteam() {
        return numOfSteam;
    }


    public void setNumOfSteam(Integer numOfSteam) {
        this.numOfSteam = numOfSteam;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        // TODO Auto-generated method stub
        return new GroupIterator(listOfGroup);
    }

    
}
