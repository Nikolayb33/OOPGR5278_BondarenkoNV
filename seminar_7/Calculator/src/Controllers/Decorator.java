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
        log.log("_______СТАРТ_________");//начало записи
        String result = old_calc.run();// запускаем сценарий
        if (result == "Ошибка оператора"){
            log.log("____________ОШИБКА ОПЕРАТОРА__________");
            return "";
        }
        if (result == "Ошибка"){
            log.log("____________ОШИБКА ОПЕРАНДА__________");
            return "";
        }
        else{
        log.log("________КОНЕЦ ЗАПИСИ__________");
        return "";// конец записи
        }
    }
}