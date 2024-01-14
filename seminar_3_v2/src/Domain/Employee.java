package Domain;

public class Employee extends Person{
    // поля
    private String special;
    // конструктор

    public Employee(String name, Integer age, String special) {
        super(name, age);
        this.special = special;
    }

    //  геттеры сеттеры для special
    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Persone = {name : " + super.getName() + ", age : " + super.getAge() + ", special: " + special + " }";
    }
    

}
