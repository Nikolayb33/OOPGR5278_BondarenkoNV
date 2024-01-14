import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;
import Classes.Actor;

public class App {
    public static void main(String[] args) throws Exception {
        // создание маркета
        Market magnit = new Market();

        // создание обычного клиента
        Actor client1 = new OrdinaryClient("Борис", 1);
        Actor client2 = new OrdinaryClient("Ольга", 2);

        // создание спец клиента
        Actor client3 = new SpecialClient("Звезда", 3);
        // создание налогового инспектора
        iActorBehaviour client4 = new TaxInspector(); 
        // создание акционного клиента
        PromotionClient client5 = new PromotionClient("Promo1", 5, "First");

        // запускаем клиентов в магазин
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        // запускаем налогового инспектора
        magnit.acceptToMarket(client4);
        // запускаем акционного 
        magnit.acceptToMarket(client5);


        magnit.update();

        // клиент возвращает заказ магазину
        client5.returnOrder();
        //изменений количества участников акции, в которой участвует клиент
        client5.setMaxParticipants(1000);

        //возвращаю число участников акции
        System.out.println(client5.getMaxParticipants());

    }
}
