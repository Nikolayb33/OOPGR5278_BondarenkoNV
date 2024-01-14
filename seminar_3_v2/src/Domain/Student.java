package Domain;

public class Student extends Person implements Comparable<Student>{
    
    // поля
    private int id;

    static int generateId;


    // конструктор
    public Student(String name, Integer age) {
        super(name, age);

        this.id = generateId;
        generateId ++;
    }

    

   
// геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
// переопределение метода toString
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Persone = {name : " + super.getName() + ", age : " + super.getAge() + ", id: " + id + " }";
    }




    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }
}

    
