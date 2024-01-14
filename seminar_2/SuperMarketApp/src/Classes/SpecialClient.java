package Classes;

public class SpecialClient extends Actor{
    // Поле
    private int vipId;

    // Конструктор
    public SpecialClient(String name, int vipId) {
        super(name);
        this.vipId = vipId;
    }

    // геттер
    public int getVipId() {
        return vipId;
    }

    // сеттер
    public void setVipId(int vipId) {
        this.vipId = vipId;
    }


    // методы родителя (обязательные методы абстрактного класса родителя)
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }
// методы согласно диаграмме
    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }

    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }
    
    public void setTakeOrder(boolean val){
        super.isTakeOrder = val;
    }
    
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor getActor(){
        return this;
    }
    
    
}
