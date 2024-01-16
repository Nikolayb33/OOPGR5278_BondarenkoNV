package Domain;

public abstract class Person {
    //поля (закрытые, только в крайнем случае их открываем) статики используем в крайних случаях
    private String name;
    private int age;

    // конструктор
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // геттер
    public String getName() {
        return name;
    }

    // сеттер
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Persone = {name : " + name + ", age : " + age + " }";
    }

    

}
