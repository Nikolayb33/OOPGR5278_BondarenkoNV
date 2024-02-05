package Views;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Controllers.Interfaces.iCalculator;
import Controllers.Interfaces.iView;
import Modules.Domain.ComplexNum;
import java.util.Scanner;

public class ViewCalc implements iView{


    // поле контроллера
    private iCalculator contr;


    // сеттер для контроллера
    public void setContr(iCalculator contr) {
        this.contr = contr;
    }

    // получение опреатора
    @Override
    public String operator() {
        System.out.println("Введите оператор +, *, /");
        String op = System.console().readLine();
        if (op.equals("+") || op.equals("*") || op.equals("/"))  {
            return op;
        }
        else {
            return "Введен не правильный запрос";
        }
    }

    // получение первого комплексного числа
    @Override
    public ComplexNum firstOperand() {
        System.out.println("Введите первое комплексное число. Формат ввода:4 + 2i");
        String complex_1 = System.console().readLine();
        List<String> cmp = new ArrayList<>();
        for (String s: complex_1.split(" ")){
            
            if (s.endsWith("i")){
                String b = s.replace("i", "");
                cmp.add(b);
            }
            else{
                cmp.add(s);
            }
            
        }

        String actualOperand_s = cmp.getFirst();
        int actualOperand = Integer.parseInt(actualOperand_s);
        String imaginaryOperand_s = cmp.get(1) + cmp.get(2);
        int imaginaryOperand = Integer.parseInt(imaginaryOperand_s);
        ComplexNum first_operand = new ComplexNum(actualOperand, imaginaryOperand);
        return first_operand;
    }

    // получение второго комплексного числа
    @Override
    public ComplexNum secondOperand() {
        System.out.println("Введите второе комплексное число. Формат ввода:4 + 2i");
        String complex_2 = System.console().readLine();
        List<String> cmp = new ArrayList<>();
        for (String s: complex_2.split(" ")){
            if (s.endsWith("i")){
                String b = s.replace("i", "");
                cmp.add(b);
            }
            else{
                cmp.add(s);
            }
        }

        String actualOperand_s = cmp.getFirst();
        int actualOperand = Integer.parseInt(actualOperand_s);
        String imaginaryOperand_s = cmp.get(1) + cmp.get(2);
        int imaginaryOperand = Integer.parseInt(imaginaryOperand_s);
        ComplexNum second_operand = new ComplexNum(actualOperand, imaginaryOperand);
        return second_operand;
    }

    @Override
    public String result(ComplexNum cNum) {
        System.out.println("-----------------------------");
        
        return cNum.toString();
    }

    //метод запускающий программу в клиентском коде
    public void ViewRun()
    {
        contr.run();
    }
    
}
