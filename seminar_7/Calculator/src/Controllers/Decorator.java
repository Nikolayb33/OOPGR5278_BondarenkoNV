package Controllers;

import Controllers.Interfaces.iCalculator;

public class Decorator implements iCalculator{

    // поля
    private Calculator old_calc;
    private Logger log;

    // конструктор
    public Decorator(Calculator old_calc, Logger log) {
        this.old_calc = old_calc;
        this.log = log;
    }

    @Override
    public String run() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
        log.log("Начало записи");//начало записи
        old_calc.run();// запускаем сценарий
        log.log("Результат получен");// конец записи
        return ""; // сообщение, что лог записан
    }


    
}
