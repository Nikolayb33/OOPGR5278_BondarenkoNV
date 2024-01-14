package Classes;

public class OrdinaryClient extends Actor{
    private int number;
// конструктор
    public OrdinaryClient(String name, int number) {
        super(name);
        this.number = number;
    }


    
// геттер
    public int getNumber() {
        return number;
    }
// сеттер
    public void setNumber(int number) {
        this.number = number;
    }
// методы согласно диагарамме
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

    // переопределяем обязательные методы родителя
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
    

    
}
