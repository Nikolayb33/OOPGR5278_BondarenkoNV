package Domain;

public class Teacher extends Person {
    // поля
    private String acadDegree;

    // конструктор
    public Teacher(String name, Integer age, String acadDegree) {
        super(name, age);
        this.acadDegree = acadDegree;
        //TODO Auto-generated constructor stub
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Persone = {name : " + super.getName() + ", age : " + super.getAge() + ", acadDegree: " + acadDegree + " }";
    }
  


    
    
}
