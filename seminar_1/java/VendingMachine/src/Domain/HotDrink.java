package Domain;

public class HotDrink extends Product{
    // создание дополнительного поля температура
    private int temperature;

    // создание конструктора
    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    // методы
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // переопределяем метод toString
    @Override
    public String toString(){
        return super.toString() + "Temperature = " + temperature + "\n";
    }
    
}
