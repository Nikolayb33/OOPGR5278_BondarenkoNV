package Controllers;

import java.util.List;

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
        String fail = "Ошибка";
        String op = view.operator();
        if (op == "Ошибка оператора"){
            return op;
        }
        
        List<Integer> cmp = view.inputFirstOperand();
        if (cmp.size() <= 1){
            return fail;
        }
        ComplexNum frst = view.firstOperand(cmp);
        List<Integer> cmp2 = view.inputSecondOperand();
        if (cmp2.size() <= 1){
            return fail;
        }
        ComplexNum scnd = view.secondOperand(cmp2);
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
            return fail;
        }
    }

    
}