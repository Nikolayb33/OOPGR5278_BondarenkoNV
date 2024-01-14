package Classes;

import Interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour{
    // добавляем поля
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    // конструктор с жестко заданным именем
    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }


    public String getName(){
        return name;
    }

    @Override
    public Actor getActor() {
        // TODO Auto-generated method stub
        return new OrdinaryClient("Тайный покупатель", 4);
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean val) {
        // TODO Auto-generated method stub
        this.isMakeOrder = val;
    }

    @Override
    public void setTakeOrder(boolean val) {
        // TODO Auto-generated method stub
        this.isTakeOrder = val;
    }

    

}
