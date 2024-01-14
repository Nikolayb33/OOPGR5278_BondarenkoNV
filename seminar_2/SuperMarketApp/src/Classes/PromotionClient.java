package Classes;

import java.util.List;
import java.util.Map;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class PromotionClient implements iActorBehaviour, iReturnOrder{

    // поля
    private String nameOfPromo;
    private int idClient;
    static int maxParticipants = 100; // задаем первоначальное значение для всех акций

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;


    // конструткор
    public PromotionClient(String nameOfPromo, int idClient, String name) {
        this.nameOfPromo = nameOfPromo;
        this.idClient = idClient;
        this.name = name;
    }



    public String getNameOfPromo() {
        return nameOfPromo;
    }



    public void setNameOfPromo(String nameOfPromo) {
        this.nameOfPromo = nameOfPromo;
    }



    public int getIdClient() {
        return idClient;
    }



    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }



    public static int getMaxParticipants() {
        return maxParticipants;
    }



    public static void setMaxParticipants(int maxParticipants) {
        PromotionClient.maxParticipants = maxParticipants;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public boolean isTakeOrder() {
        return isTakeOrder;
    }



    public void setTakeOrder(boolean isTakeOrder) {
        this.isTakeOrder = isTakeOrder;
    }



    public boolean isMakeOrder() {
        return isMakeOrder;
    }



    public void setMakeOrder(boolean isMakeOrder) {
        this.isMakeOrder = isMakeOrder;
    }



    @Override
    public Actor getActor() {
        // TODO Auto-generated method stub
        return new OrdinaryClient(name, idClient);
    }



    @Override
    public void returnOrder() {
        System.out.println("Заказ клиенту " + name + " вернули");
    }

    
    
}
