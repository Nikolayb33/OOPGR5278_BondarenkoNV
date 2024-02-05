package Controllers;

import Controllers.Interfaces.iCalculator;
import Controllers.Interfaces.iView;
import Modules.ComplexDel;
import Modules.ComplexMul;
import Modules.ComplexSum;
import Modules.Domain.ComplexNum;
import Controllers.Interfaces.iModels;


public class Calculator implements iCalculator{

    // поля
    private iView view;

    // конструктор
    public Calculator(iView view) {
        this.view = view;
    }


    //методы
    @Override
    public String run() {
        String op = view.operator();
        ComplexNum frst = view.firstOperand();
        ComplexNum scnd = view.secondOperand();
        if (op.equals("+")){
            iModels sum = new ComplexSum();
            ComplexNum result_R = sum.calculate(frst, scnd);
            return view.result(result_R);
        }
        if (op.equals("*")){
            iModels mul = new ComplexMul();
            ComplexNum result_R = mul.calculate(frst, scnd);
            return view.result(result_R);
        
        }
        if (op.equals("/")){
            iModels del = new ComplexDel();
            ComplexNum result_R = del.calculate(frst, scnd);
            return view.result(result_R);
        }
        else {
            String fail = "Ошибка";
            return fail;
        }
    }

    
}