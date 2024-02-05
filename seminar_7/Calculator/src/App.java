import java.util.ArrayList;
import java.util.List;

import Controllers.Calculator;
import Controllers.Decorator;
import Controllers.Logger;
import Modules.Domain.ComplexNum;
import Views.ViewCalc;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        
        ViewCalc view = new ViewCalc();
        Calculator calc = new Calculator(view);


        Logger log_dict = new Logger();
        Decorator new_calc = new Decorator(calc, log_dict);


        view.setContr(new_calc);
        view.ViewRun();

        // проблема , когда в imaginary part 0
        // проблема когда в опреаторе не правильный формат написан

 


        

    }
}
